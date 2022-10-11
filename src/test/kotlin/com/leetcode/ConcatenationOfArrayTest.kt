package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class ConcatenationOfArrayTest :
    SingleParameterAlgorithmTest<ConcatenationOfArray>(ConcatenationOfArray::class) {

    override fun inputValues() =
        listOf(
            intArrayOf(1, 2, 1) to intArrayOf(1, 2, 1, 1, 2, 1),
            intArrayOf(1, 3, 2, 1) to intArrayOf(1, 3, 2, 1, 1, 3, 2, 1)
        )
}