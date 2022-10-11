package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class BinaryWatchTest : SingleParameterAlgorithmTest<BinaryWatch>(BinaryWatch::class) {

    override fun inputValues() =
        listOf(
            1 to listOf("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00"),
            9 to listOf()
        )
}