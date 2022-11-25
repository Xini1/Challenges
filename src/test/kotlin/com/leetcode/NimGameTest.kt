package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class NimGameTest : SingleParameterAlgorithmTest<NimGame>(NimGame::class) {

    override fun inputValues() =
        listOf(
            4 to false,
            1 to true,
            2 to true
        )
}