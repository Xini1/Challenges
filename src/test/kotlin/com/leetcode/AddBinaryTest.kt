package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class AddBinaryTest : AlgorithmTest<AddBinary>(AddBinary::class) {

    override fun parameters() =
        listOf(
            arrayOf("11", "1") to "100",
            arrayOf("1010", "1011") to "10101"
        )
}