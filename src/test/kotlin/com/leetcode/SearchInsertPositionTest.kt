package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class SearchInsertPositionTest : AlgorithmTest<SearchInsertPosition>(SearchInsertPosition::class) {

    override fun parameters() =
        listOf(
            arrayOf(intArrayOf(1, 3, 5, 6), 5) to 2,
            arrayOf(intArrayOf(1, 3, 5, 6), 2) to 1,
            arrayOf(intArrayOf(1, 3, 5, 6), 7) to 4,
            arrayOf(intArrayOf(1, 3, 5, 6), 0) to 0,
            arrayOf(intArrayOf(1), 0) to 0
        )
}