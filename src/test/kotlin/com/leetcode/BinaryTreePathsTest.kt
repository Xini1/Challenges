package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.SingleParameterAlgorithmTest

internal class BinaryTreePathsTest : SingleParameterAlgorithmTest<BinaryTreePaths>(BinaryTreePaths::class) {

    override fun inputValues() =
        listOf(
            arrayOf(1, 2, 3, null, 5) to listOf("1->2->5", "1->3"),
            arrayOf(1) to listOf("1"),
            arrayOf(1, 2, 3, null, 5) to listOf("1->2->5", "1->3")
        )
            .map { TreeNode.from(it.first) to it.second }
}