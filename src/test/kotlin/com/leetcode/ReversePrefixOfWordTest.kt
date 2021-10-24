package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class ReversePrefixOfWordTest :
    MultipleParametersAlgorithmTest<ReversePrefixOfWord>(ReversePrefixOfWord::class) {

    override fun testValues() =
        listOf(
            arrayOf("abcdefd", 'd') to "dcbaefd",
            arrayOf("xyxzxe", 'z') to "zxyxxe",
        )
}