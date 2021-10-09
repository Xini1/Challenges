package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class PowerOfFourTest : AlgorithmTest<PowerOfFour>(PowerOfFour::class) {

    override fun parameters() =
        listOf(
            arrayOf(16) to true,
            arrayOf(5) to false,
            arrayOf(1) to true,
            arrayOf(0) to false,
            arrayOf(9) to false,
            arrayOf(4) to true,
            arrayOf(2147483647) to false
        )
}