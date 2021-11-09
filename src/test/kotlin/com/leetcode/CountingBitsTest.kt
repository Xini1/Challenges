package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class CountingBitsTest : SingleParameterAlgorithmTest<CountingBits>(CountingBits::class) {

    override fun inputValues() =
        listOf(
            2 to intArrayOf(0, 1, 1),
            5 to intArrayOf(0, 1, 1, 2, 1, 2),
        )
}