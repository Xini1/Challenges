package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
internal class LengthOfLastWordTest : BaseTest<LengthOfLastWord>() {

    override fun classUnderTest() = LengthOfLastWord::class

    override fun input() =
        listOf(
            arrayOf("Hello World") to 5,
            arrayOf(" ") to 0,
            arrayOf("a ") to 1,
        )
}