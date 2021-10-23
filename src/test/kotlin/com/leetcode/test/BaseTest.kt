package com.leetcode.test

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

/**
 * @author Maxim Tereshchenko
 */
internal abstract class BaseTest<T> {

    @TestFactory
    fun runTests() =
        parameters()
            .map { (input, expected) ->
                dynamicTest("when ${input.formatParameter()} then ${expected.formatToString()}") {
                    assertThat(testCall(input)).isEqualTo(expected)
                }
            }

    protected open fun T.formatParameter() = formatToString()

    protected fun Any?.formatToString() =
        when (this) {
            is Array<*> -> joinToString(prefix = "[", postfix = "]")
            is IntArray -> joinToString(prefix = "[", postfix = "]")
            else -> toString()
        }

    protected abstract fun parameters(): List<Pair<T, Any?>>
    protected abstract fun testCall(input: T): Any?
}