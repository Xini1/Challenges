package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MinimumDistanceBetweenBSTNodesTest :
    SingleParameterAlgorithmTest<MinimumDistanceBetweenBSTNodes>(MinimumDistanceBetweenBSTNodes::class) {

    override fun inputValues() =
        listOf(
            arrayOf(4, 2, 6, 1, 3) to 1,
            arrayOf(1, 0, 48, null, null, 12, 49) to 1,
            arrayOf(27, null, 34, null, 58, 50, null, 44) to 6,
            arrayOf(90, 69, null, 49, 89, null, 52) to 1
        )
            .map { TreeNode.from(it.first) to it.second }
}