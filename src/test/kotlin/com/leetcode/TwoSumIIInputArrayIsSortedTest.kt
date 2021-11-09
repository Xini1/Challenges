package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class TwoSumIIInputArrayIsSortedTest :
    MultipleParametersAlgorithmTest<TwoSumIIInputArrayIsSorted>(TwoSumIIInputArrayIsSorted::class) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(2, 7, 11, 15), 9) to intArrayOf(1, 2),
            arrayOf(intArrayOf(2, 3, 4), 6) to intArrayOf(1, 3),
            arrayOf(intArrayOf(-1, 0), -1) to intArrayOf(1, 2)
        )
}