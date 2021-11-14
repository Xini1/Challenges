package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class ConstructBinaryTreeFromPreorderAndInorderTraversalTest :
    MultipleParametersAlgorithmTest<ConstructBinaryTreeFromPreorderAndInorderTraversal>(
        ConstructBinaryTreeFromPreorderAndInorderTraversal::class
    ) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(3, 9, 20, 15, 7), intArrayOf(9, 3, 15, 20, 7)) to arrayOf(3, 9, 20, null, null, 15, 7),
            arrayOf(intArrayOf(-1), intArrayOf(-1)) to arrayOf(-1),
        )
            .map { it.first to TreeNode.from(it.second) }
}