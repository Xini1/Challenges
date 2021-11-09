package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class AddDigitsTest : SingleParameterAlgorithmTest<AddDigits>(AddDigits::class) {

    override fun inputValues() =
        listOf(
            38 to 2,
            0 to 0,
        )
}