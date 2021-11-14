package com.leetcode.generic

import com.leetcode.test.BaseTest

/**
 * @author Maxim Tereshchenko
 */
internal class TreeNodeWithNextTest : BaseTest<TreeNode?>() {

    override fun inputValues() =
        listOf(
            null to null,
            TreeNode(1, TreeNode(2), TreeNode(3)) to
                    TreeNodeWithNext(1, TreeNodeWithNext(2), TreeNodeWithNext(3)),
            TreeNode(1, TreeNode(2)) to
                    TreeNodeWithNext(1, TreeNodeWithNext(2)),
            TreeNode(1, null, TreeNode(2)) to
                    TreeNodeWithNext(1, null, TreeNodeWithNext(2))
        )

    override fun testCall(input: TreeNode?) = TreeNodeWithNext.from(input)
}