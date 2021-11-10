package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MaximumSubarrayTest : SingleParameterAlgorithmTest<MaximumSubarray>(MaximumSubarray::class) {

    override fun inputValues() =
        listOf(
            intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4) to 6,
            intArrayOf(1) to 1,
            intArrayOf(5, 4, -1, 7, 8) to 23
        )
}