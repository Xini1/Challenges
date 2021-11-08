package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class SquaresOfASortedArrayTest :
    SingleParameterAlgorithmTest<SquaresOfASortedArray>(SquaresOfASortedArray::class) {

    override fun testValues() =
        listOf(
            intArrayOf(-4, -1, 0, 3, 10) to intArrayOf(0, 1, 9, 16, 100),
            intArrayOf(-7, -3, 2, 3, 11) to intArrayOf(4, 9, 9, 49, 121)
        )
}