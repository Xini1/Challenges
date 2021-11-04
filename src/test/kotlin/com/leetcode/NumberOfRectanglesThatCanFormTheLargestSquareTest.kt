package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class NumberOfRectanglesThatCanFormTheLargestSquareTest :
    SingleParameterAlgorithmTest<NumberOfRectanglesThatCanFormTheLargestSquare>(
        NumberOfRectanglesThatCanFormTheLargestSquare::class
    ) {

    override fun testValues() =
        listOf(
            arrayOf(intArrayOf(5, 8), intArrayOf(3, 9), intArrayOf(5, 12), intArrayOf(16, 5)) to 3,
            arrayOf(intArrayOf(2, 3), intArrayOf(3, 7), intArrayOf(4, 3), intArrayOf(3, 7)) to 3
        )
}