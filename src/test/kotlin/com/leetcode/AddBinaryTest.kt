package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class AddBinaryTest : MultipleParametersAlgorithmTest<AddBinary>(AddBinary::class) {

    override fun inputValues() =
        listOf(
            arrayOf("11", "1") to "100",
            arrayOf("1010", "1011") to "10101"
        )
}