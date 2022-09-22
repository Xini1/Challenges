package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class SummaryRangesTest : SingleParameterAlgorithmTest<SummaryRanges>(SummaryRanges::class) {

    override fun inputValues() =
        listOf(
            intArrayOf(0, 1, 2, 4, 5, 7) to listOf("0->2", "4->5", "7"),
            intArrayOf(0, 2, 3, 4, 6, 8, 9) to listOf("0", "2->4", "6", "8->9"),
            intArrayOf() to listOf()
        )
}