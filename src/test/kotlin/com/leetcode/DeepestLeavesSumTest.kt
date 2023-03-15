package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.SingleParameterAlgorithmTest

internal class DeepestLeavesSumTest : SingleParameterAlgorithmTest<DeepestLeavesSum>(DeepestLeavesSum::class) {

    override fun inputValues() =
        listOf(
            arrayOf(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8) to 15,
            arrayOf(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5) to 19
        )
            .map { TreeNode.from(it.first) to it.second }
}