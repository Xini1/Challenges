package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class StrictlyPalindromicNumberTest :
    SingleParameterAlgorithmTest<StrictlyPalindromicNumber>(StrictlyPalindromicNumber::class) {

    override fun inputValues() =
        listOf(
            9 to false,
            4 to false,
            195 to false
        )
}