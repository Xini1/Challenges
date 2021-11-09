package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class PalindromeNumberTest : SingleParameterAlgorithmTest<PalindromeNumber>(PalindromeNumber::class) {

    override fun inputValues() =
        listOf(
            121 to true,
            -121 to false,
            10 to false,
            -101 to false
        )
}