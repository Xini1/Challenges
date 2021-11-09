package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class BinarySearchTest : MultipleParametersAlgorithmTest<BinarySearch>(BinarySearch::class) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(-1, 0, 3, 5, 9, 12), 9) to 4,
            arrayOf(intArrayOf(-1, 0, 3, 5, 9, 12), 2) to -1
        )
}