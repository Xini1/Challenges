package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class LowestCommonAncestorOfABinaryTreeTest :
    MultipleParametersAlgorithmTest<LowestCommonAncestorOfABinaryTree>(LowestCommonAncestorOfABinaryTree::class) {

    override fun inputValues() =
        listOf(
            arrayOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4) to arrayOf(5, 1, 3),
            arrayOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4) to arrayOf(5, 4, 5),
            arrayOf(1, 2) to arrayOf(1, 2, 1)
        )
            .map {
                val root = TreeNode.from(it.first)

                arrayOf(root, root?.findByValue(it.second[0]), root?.findByValue(it.second[1])) to
                        root?.findByValue(it.second[2])
            }
}