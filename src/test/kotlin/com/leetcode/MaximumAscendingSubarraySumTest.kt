package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MaximumAscendingSubarraySumTest :
    SingleParameterAlgorithmTest<MaximumAscendingSubarraySum>(MaximumAscendingSubarraySum::class) {

    override fun testValues() =
        listOf(
            intArrayOf(10, 20, 30, 5, 10, 50) to 65,
            intArrayOf(10, 20, 30, 40, 50) to 150,
            intArrayOf(12, 17, 15, 13, 10, 11, 12) to 33,
            intArrayOf(100, 10, 1) to 100
        )
}