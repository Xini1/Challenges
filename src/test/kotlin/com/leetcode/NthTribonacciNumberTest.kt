package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class NthTribonacciNumberTest : SingleParameterAlgorithmTest<NthTribonacciNumber>(NthTribonacciNumber::class) {

    override fun inputValues() =
        listOf(
            4 to 4,
            25 to 1389537,
            36 to 1132436852
        )
}