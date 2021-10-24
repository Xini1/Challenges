package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MaximumAscendingSubarraySumTest :
    AlgorithmTest<MaximumAscendingSubarraySum>(MaximumAscendingSubarraySum::class) {

    override fun parameters() =
        listOf(
            intArrayOf(10, 20, 30, 5, 10, 50) to 65,
            intArrayOf(10, 20, 30, 40, 50) to 150,
            intArrayOf(12, 17, 15, 13, 10, 11, 12) to 33,
            intArrayOf(100, 10, 1) to 100
        )
            .map { arrayOf(it.first) to it.second }
}