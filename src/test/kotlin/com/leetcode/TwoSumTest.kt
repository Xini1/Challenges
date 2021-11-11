package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class TwoSumTest : MultipleParametersAlgorithmTest<TwoSum>(TwoSum::class) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(2, 7, 11, 15), 9) to intArrayOf(0, 1),
            arrayOf(intArrayOf(3, 2, 4), 6) to intArrayOf(1, 2),
            arrayOf(intArrayOf(3, 3), 6) to intArrayOf(0, 1)
        )
}