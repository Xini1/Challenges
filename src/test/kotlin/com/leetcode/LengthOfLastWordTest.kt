package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

/**
 * @author Maxim Tereshchenko
 */
internal class LengthOfLastWordTest {

    @TestFactory
    fun tests() = listOf(
        "Hello World" to 5,
        " " to 0,
        "a " to 1L,
    )
        .map { (input, expected) ->
            dynamicTest("given $input return $expected") {
                assertThat(LengthOfLastWord().lengthOfLastWord(input)).isEqualTo(expected)
            }
        }
}