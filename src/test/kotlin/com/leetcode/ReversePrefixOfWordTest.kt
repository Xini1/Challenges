package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class ReversePrefixOfWordTest :
    MultipleParametersAlgorithmTest<ReversePrefixOfWord>(ReversePrefixOfWord::class) {

    override fun inputValues() =
        listOf(
            arrayOf("abcdefd", 'd') to "dcbaefd",
            arrayOf("xyxzxe", 'z') to "zxyxxe",
        )
}