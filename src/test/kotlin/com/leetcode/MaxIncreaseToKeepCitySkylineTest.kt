package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class MaxIncreaseToKeepCitySkylineTest :
    SingleParameterAlgorithmTest<MaxIncreaseToKeepCitySkyline>(MaxIncreaseToKeepCitySkyline::class) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(3, 0, 8, 4), intArrayOf(2, 4, 5, 7), intArrayOf(9, 2, 6, 3), intArrayOf(0, 3, 1, 0))
                    to 35,
            arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))
                    to 0
        )
}