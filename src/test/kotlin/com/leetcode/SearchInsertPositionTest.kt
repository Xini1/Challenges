package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
internal class SearchInsertPositionTest : BaseTest<SearchInsertPosition>() {

    override fun classUnderTest() = SearchInsertPosition::class

    override fun input() =
        listOf(
            arrayOf(intArrayOf(1, 3, 5, 6), 5) to 2,
            arrayOf(intArrayOf(1, 3, 5, 6), 2) to 1,
            arrayOf(intArrayOf(1, 3, 5, 6), 7) to 4,
            arrayOf(intArrayOf(1, 3, 5, 6), 0) to 0,
            arrayOf(intArrayOf(1), 0) to 0,
        )
}