package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class HouseRobberTest : SingleParameterAlgorithmTest<HouseRobber>(HouseRobber::class) {

    override fun inputValues() =
        listOf(
            intArrayOf(1, 2, 3, 1) to 4,
            intArrayOf(2, 7, 9, 3, 1) to 12
        )
}