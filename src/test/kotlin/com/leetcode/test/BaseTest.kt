package com.leetcode.test

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

/**
 * @author Maxim Tereshchenko
 */
internal abstract class BaseTest<T> {

    @TestFactory
    protected fun runTests() =
        parameters()
            .map { (input, expected) ->
                DynamicTest.dynamicTest("when ${input.formatParameter()} then $expected") {
                    Assertions.assertThat(testCall(input)).isEqualTo(expected)
                }
            }

    protected abstract fun parameters(): List<Pair<T, Any?>>
    protected open fun T.formatParameter() = toString()
    protected abstract fun testCall(input: T): Any?
}