package com.leetcode

import com.leetcode.test.MutableMultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class RotateArrayTest :
    MutableMultipleParametersAlgorithmTest<RotateArray>(RotateArray::class, 0) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(-1, -100, 3, 99), 2) to intArrayOf(3, 99, -1, -100),
            arrayOf(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3) to intArrayOf(5, 6, 7, 1, 2, 3, 4)
        )
}