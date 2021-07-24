package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

/**
 * @author Maxim Tereshchenko
 */
internal class PalindromeNumberTest : BaseTest<PalindromeNumber>() {

    override fun classUnderTest() = PalindromeNumber::class

    override fun input() =
        listOf(
            arrayOf(121) to true,
            arrayOf(-121) to false,
            arrayOf(10) to false,
            arrayOf(-101) to false
        )
}