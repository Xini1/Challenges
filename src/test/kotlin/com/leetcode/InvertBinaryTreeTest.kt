package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class InvertBinaryTreeTest : SingleParameterAlgorithmTest<InvertBinaryTree>(InvertBinaryTree::class) {

    override fun testValues() =
        listOf(
            arrayOf(4, 2, 7, 1, 3, 6, 9) to arrayOf(4, 7, 2, 9, 6, 3, 1),
            arrayOf(2, 1, 3) to arrayOf(2, 3, 1),
            arrayOf<Int?>() to arrayOf()
        )
            .map { TreeNode.from(it.first) to TreeNode.from(it.second) }
}