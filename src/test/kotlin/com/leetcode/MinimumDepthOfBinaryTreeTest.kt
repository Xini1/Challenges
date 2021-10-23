package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MinimumDepthOfBinaryTreeTest : AlgorithmTest<MinimumDepthOfBinaryTree>(MinimumDepthOfBinaryTree::class) {

    override fun parameters() =
        listOf(
            arrayOf(TreeNode.from(arrayOf(3, 9, 20, null, null, 15, 7))) to 2,
            arrayOf(TreeNode.from(arrayOf(2, null, 3, null, 4, null, 5, null, 6))) to 5,
            arrayOf(TreeNode.from(arrayOf(1,2,3,4,5))) to 2
        )
}