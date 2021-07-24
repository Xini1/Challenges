package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
internal class AddBinaryTest : BaseTest<AddBinary>() {

    override fun classUnderTest() = AddBinary::class

    override fun input() =
        listOf(
            arrayOf("11", "1") to "100",
            arrayOf("1010", "1011") to "10101"
        )
}