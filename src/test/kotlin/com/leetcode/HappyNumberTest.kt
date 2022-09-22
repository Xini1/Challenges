package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class HappyNumberTest : SingleParameterAlgorithmTest<HappyNumber>(HappyNumber::class) {

    override fun inputValues() =
        listOf(
            19 to true,
            2 to false,
            3 to false
        )
}