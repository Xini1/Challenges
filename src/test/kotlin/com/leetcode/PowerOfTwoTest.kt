package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class PowerOfTwoTest : SingleParameterAlgorithmTest<PowerOfTwo>(PowerOfTwo::class) {

    override fun inputValues() =
        listOf(
            1 to true,
            16 to true,
            3 to false,
            8 to true,
            536870912 to true,
            257 to false,
            2097153 to false,
            2147483647 to false
        )
}