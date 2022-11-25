package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

internal class WordPatternTest : MultipleParametersAlgorithmTest<WordPattern>(WordPattern::class) {

    override fun inputValues() =
        listOf(
            arrayOf("abba", "dog cat cat dog") to true,
            arrayOf("abba", "dog cat cat fish") to false,
            arrayOf("aaaa", "dog cat cat dog") to false,
            arrayOf("abba", "dog dog dog dog") to false
        )
}