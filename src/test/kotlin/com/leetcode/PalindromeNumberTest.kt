package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class PalindromeNumberTest : AlgorithmTest<PalindromeNumber>(PalindromeNumber::class) {

    override fun parameters() =
        listOf(
            arrayOf(121) to true,
            arrayOf(-121) to false,
            arrayOf(10) to false,
            arrayOf(-101) to false
        )
}