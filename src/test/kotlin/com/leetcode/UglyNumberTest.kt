package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class UglyNumberTest : SingleParameterAlgorithmTest<UglyNumber>(UglyNumber::class) {

    override fun inputValues() =
        listOf(
            6 to true,
            1 to true,
            14 to false
        )
}