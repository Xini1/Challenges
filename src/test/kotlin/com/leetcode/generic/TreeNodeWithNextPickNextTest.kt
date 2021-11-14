package com.leetcode.generic

import com.leetcode.test.BaseTest

/**
 * @author Maxim Tereshchenko
 */
internal class TreeNodeWithNextPickNextTest : BaseTest<Pair<TreeNodeWithNext, Array<Int?>>>() {

    override fun inputValues() =
        listOf(
            arrayOf(1, 2, 3, 4, 5, 6, 7) to arrayOf(1, null, 2, 3, null, 4, 5, 6, 7, null) to treeNodeWithNext1(),
            arrayOf(1, 2, 3, 4, 5, null, 7) to arrayOf(1, null, 2, 3, null, 4, 5, 7, null) to treeNodeWithNext2()
        )
            .map { TreeNodeWithNext.from(TreeNode.from(it.first.first))!! to it.first.second to it.second }

    override fun testCall(input: Pair<TreeNodeWithNext, Array<Int?>>) = input.first.pickNext(input.second)

    override fun examinedValue(input: Pair<TreeNodeWithNext, Array<Int?>>, returnValue: Any?) =
        input.first

    private fun treeNodeWithNext1(): TreeNodeWithNext {
        val node7 = TreeNodeWithNext(7)
        val node6 = TreeNodeWithNext(6, next = node7)
        val node5 = TreeNodeWithNext(5, next = node6)
        val node4 = TreeNodeWithNext(4, next = node5)
        val node3 = TreeNodeWithNext(3, node6, node7)
        val node2 = TreeNodeWithNext(2, node4, node5, node3)

        return TreeNodeWithNext(1, node2, node3)
    }

    private fun treeNodeWithNext2(): TreeNodeWithNext {
        val node7 = TreeNodeWithNext(7)
        val node5 = TreeNodeWithNext(5, next = node7)
        val node4 = TreeNodeWithNext(4, next = node5)
        val node3 = TreeNodeWithNext(3, right = node7)
        val node2 = TreeNodeWithNext(2, node4, node5, node3)

        return TreeNodeWithNext(1, node2, node3)
    }
}