package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class SerializeAndDeserializeBinaryTreeTest :
    SingleParameterAlgorithmTest<SerializeAndDeserializeBinaryTree>(SerializeAndDeserializeBinaryTree::class) {

    override fun inputValues() =
        listOf(
            arrayOf(1, 2, 3, null, null, 4, 5),
            arrayOf(),
            arrayOf(1),
            arrayOf(1, 2)
        )
            .map { TreeNode.from(it) }
            .map { it to it }
}