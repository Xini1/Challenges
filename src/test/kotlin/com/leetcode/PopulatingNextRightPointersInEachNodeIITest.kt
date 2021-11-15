package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.generic.TreeNodeWithNext
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class PopulatingNextRightPointersInEachNodeIITest :
    SingleParameterAlgorithmTest<PopulatingNextRightPointersInEachNodeII>(
        PopulatingNextRightPointersInEachNodeII::class
    ) {
    override fun inputValues() =
        listOf(
            arrayOf(1, 2, 3, 4, 5, null, 7) to arrayOf(1, null, 2, 3, null, 4, 5, 7, null),
            arrayOf<Int?>() to arrayOf(),
            arrayOf(1, 2, 3, 4, null, null, 5) to arrayOf(1, null, 2, 3, null, 4, 5, null),
            arrayOf(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8) to
                    arrayOf(1, null, 2, 3, null, 4, 5, 6, null, 7, 8, null)
        )
            .map { TreeNode.from(it.first) to it.second }
            .map { TreeNodeWithNext.from(it.first) to TreeNodeWithNext.from(it.first)?.apply { pickNext(it.second) } }
}