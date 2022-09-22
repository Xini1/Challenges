package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

internal class IsomorphicStringsTest : MultipleParametersAlgorithmTest<IsomorphicStrings>(IsomorphicStrings::class) {

    override fun inputValues() =
        listOf(
            arrayOf("egg", "add") to true,
            arrayOf("foo", "bar") to false,
            arrayOf("paper", "title") to true,
            arrayOf("bbbaaaba", "aaabbbba") to false
        )
}