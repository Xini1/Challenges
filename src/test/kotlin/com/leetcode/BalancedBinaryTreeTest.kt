package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class BalancedBinaryTreeTest : AlgorithmTest<BalancedBinaryTree>(BalancedBinaryTree::class) {

    override fun parameters() =
        listOf(
            arrayOf(TreeNode.of(arrayOf(3, 9, 20, null, null, 15, 7))) to true,
            arrayOf(TreeNode.of(arrayOf(1, 2, 2, 3, 3, null, null, 4, 4))) to false,
            arrayOf(TreeNode.of(arrayOf())) to true,
            arrayOf(TreeNode.of(arrayOf(1,2,2,3,null,null,3,4,null,null,4))) to false
        )
}