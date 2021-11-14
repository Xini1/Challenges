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
        inputValues()
            .map { (input, expected) ->
                dynamicTest("when ${input.formatParameter()} then ${expected.formatToString()}") {
                    val returnValue = testCall(input)
                    assertThat(examinedValue(input, returnValue)).isEqualTo(expected)
                }
            }

    protected open fun T.formatParameter() = formatToString()

    protected fun Any?.formatToString(): String =
        when (this) {
            is Array<*> -> joinToString(prefix = "[", postfix = "]") { it.formatToString() }
            is IntArray -> joinToString(prefix = "[", postfix = "]")
            is Pair<*, *> -> "(${first.formatToString()}, ${second.formatToString()})"
            else -> toString()
        }

    protected abstract fun inputValues(): List<Pair<T, Any?>>
    protected abstract fun testCall(input: T): Any?
    protected open fun examinedValue(input: T, returnValue: Any?): Any? = returnValue
}