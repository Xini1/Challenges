package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MinimumDepthOfBinaryTreeTest :
    SingleParameterAlgorithmTest<MinimumDepthOfBinaryTree>(MinimumDepthOfBinaryTree::class) {

    override fun inputValues() =
        listOf(
            arrayOf(3, 9, 20, null, null, 15, 7) to 2,
            arrayOf(2, null, 3, null, 4, null, 5, null, 6) to 5,
            arrayOf(1, 2, 3, 4, 5) to 2
        )
            .map { TreeNode.from(it.first) to it.second }
}