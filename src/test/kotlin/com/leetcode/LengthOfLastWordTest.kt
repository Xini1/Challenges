package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class LengthOfLastWordTest : AlgorithmTest<LengthOfLastWord>(LengthOfLastWord::class) {

    override fun parameters() =
        listOf(
            arrayOf("Hello World") to 5,
            arrayOf(" ") to 0,
            arrayOf("a ") to 1
        )
}