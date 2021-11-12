package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class LongestSubstringWithoutRepeatingCharactersTest :
    SingleParameterAlgorithmTest<LongestSubstringWithoutRepeatingCharacters>(
        LongestSubstringWithoutRepeatingCharacters::class
    ) {

    override fun inputValues() =
        listOf(
            "abcabcbb" to 3,
            "bbbbb" to 1,
            "pwwkew" to 3,
            "" to 0
        )
}