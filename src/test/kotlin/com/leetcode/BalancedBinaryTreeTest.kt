package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class BalancedBinaryTreeTest : SingleParameterAlgorithmTest<BalancedBinaryTree>(BalancedBinaryTree::class) {

    override fun testValues() =
        listOf(
            arrayOf(3, 9, 20, null, null, 15, 7) to true,
            arrayOf(1, 2, 2, 3, 3, null, null, 4, 4) to false,
            arrayOf<Int?>() to true,
            arrayOf(1, 2, 2, 3, null, null, 3, 4, null, null, 4) to false
        )
            .map { TreeNode.from(it.first) to it.second }
}