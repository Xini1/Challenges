package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class SearchInABinarySearchTreeTest :
    MultipleParametersAlgorithmTest<SearchInABinarySearchTree>(SearchInABinarySearchTree::class) {

    override fun inputValues() =
        listOf(
            arrayOf(TreeNode.from(arrayOf(4, 2, 7, 1, 3)), 5) to null
        )
}