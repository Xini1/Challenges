package com.leetcode

import com.leetcode.test.MutableMultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MergeSortedArrayTest :
    MutableMultipleParametersAlgorithmTest<MergeSortedArray>(MergeSortedArray::class, 0) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3) to intArrayOf(1, 2, 2, 3, 5, 6),
            arrayOf(intArrayOf(1), 1, intArrayOf(), 0) to intArrayOf(1)
        )
}