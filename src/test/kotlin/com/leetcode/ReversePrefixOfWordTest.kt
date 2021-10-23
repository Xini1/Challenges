package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class ReversePrefixOfWordTest : AlgorithmTest<ReversePrefixOfWord>(ReversePrefixOfWord::class) {

    override fun parameters() =
        listOf(
            arrayOf("abcdefd", 'd') to "dcbaefd",
            arrayOf("xyxzxe", 'z') to "zxyxxe",
        )
}