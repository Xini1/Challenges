package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class FloodFillTest : MultipleParametersAlgorithmTest<FloodFill>(FloodFill::class) {

    override fun inputValues() =
        listOf(
            arrayOf(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)), 0, 0, 2) to
                    arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 2)),
            arrayOf(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1)), 1, 1, 2) to
                    arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1)),
            arrayOf(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 1)), 1, 1, 1) to
                    arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 1))
        )
}