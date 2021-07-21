package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

/**
 * @author Maxim Tereshchenko
 */
internal class PalindromeNumberTest {

    @TestFactory
    fun tests() = listOf(
        121 to true,
        -121 to false,
        10 to false,
        -101 to false
    )
        .map { (input, expected) ->
            dynamicTest("given $input return $expected") {
                assertThat(PalindromeNumber().isPalindrome(input)).isEqualTo(expected)
            }
        }
}