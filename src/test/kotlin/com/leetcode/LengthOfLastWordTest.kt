package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class LengthOfLastWordTest : SingleParameterAlgorithmTest<LengthOfLastWord>(LengthOfLastWord::class) {

    override fun testValues() =
        listOf(
            "Hello World" to 5,
            " " to 0,
            "a " to 1
        )
}