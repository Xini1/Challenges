package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.generic.TreeNodeWithNext
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class PopulatingNextRightPointersInEachNodeTest :
    SingleParameterAlgorithmTest<PopulatingNextRightPointersInEachNode>(PopulatingNextRightPointersInEachNode::class) {

    override fun inputValues() =
        listOf(
            arrayOf(1, 2, 3, 4, 5, 6, 7) to arrayOf(1, null, 2, 3, null, 4, 5, 6, 7, null),
            arrayOf<Int?>() to arrayOf(),
            arrayOf(-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13) to
                    arrayOf(-1, null, 0, 1, null, 2, 3, 4, 5, null, 6, 7, 8, 9, 10, 11, 12, 13, null)
        )
            .map { TreeNode.from(it.first) to it.second }
            .map { TreeNodeWithNext.from(it.first) to TreeNodeWithNext.from(it.first)?.apply { pickNext(it.second) } }
}