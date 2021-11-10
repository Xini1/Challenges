package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class FibonacciNumberTest : SingleParameterAlgorithmTest<FibonacciNumber>(FibonacciNumber::class) {

    override fun inputValues() =
        listOf(
            2 to 1,
            3 to 2,
            4 to 3
        )
}