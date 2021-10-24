package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class PowerOfFourTest : SingleParameterAlgorithmTest<PowerOfFour>(PowerOfFour::class) {

    override fun testValues() =
        listOf(
            16 to true,
            5 to false,
            1 to true,
            0 to false,
            9 to false,
            4 to true,
            2147483647 to false
        )
}