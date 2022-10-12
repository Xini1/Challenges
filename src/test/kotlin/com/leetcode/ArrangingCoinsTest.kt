package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class ArrangingCoinsTest : SingleParameterAlgorithmTest<ArrangingCoins>(ArrangingCoins::class) {

    override fun inputValues() =
        listOf(
            5 to 2,
            8 to 3
        )
}