package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class SameTreeTest : MultipleParametersAlgorithmTest<SameTree>(SameTree::class) {

    override fun testValues() =
        listOf(
            arrayOf(TreeNode.from(arrayOf(1, 2, 3)), TreeNode.from(arrayOf(1, 2, 3))) to true,
            arrayOf(TreeNode.from(arrayOf(1, 2)), TreeNode.from(arrayOf(1, null, 2))) to false,
            arrayOf(TreeNode.from(arrayOf(1, 2, 1)), TreeNode.from(arrayOf(1, 1, 2))) to false
        )
}