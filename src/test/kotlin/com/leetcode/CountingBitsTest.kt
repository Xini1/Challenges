package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class CountingBitsTest : AlgorithmTest<CountingBits>(CountingBits::class) {

    override fun parameters() =
        listOf(
            2 to intArrayOf(0, 1, 1),
            5 to intArrayOf(0, 1, 1, 2, 1, 2),
        )
            .map { arrayOf(it.first) to it.second }
}