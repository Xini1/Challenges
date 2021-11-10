package com.leetcode

import com.leetcode.test.MutableSingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class ReverseStringTest : MutableSingleParameterAlgorithmTest<ReverseString>(ReverseString::class) {

    override fun inputValues() =
        listOf(
            charArrayOf('h', 'e', 'l', 'l', 'o') to charArrayOf('o', 'l', 'l', 'e', 'h'),
            charArrayOf('H', 'a', 'n', 'n', 'a', 'h') to charArrayOf('h', 'a', 'n', 'n', 'a', 'H')
        )
}