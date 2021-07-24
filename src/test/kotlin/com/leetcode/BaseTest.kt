package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.reflect.KClass
import kotlin.reflect.full.functions

/**
 * @author Maxim Tereshchenko
 */
abstract class BaseTest<T : Any> {

    @TestFactory
    protected fun runTests() =
        input()
            .map { (args, expected) ->
                dynamicTest("when [${args.toFormattedString()}] then [$expected]") {
                    assertThat(findMethodUnderTest().call(createObjectUnderTest(), *args)).isEqualTo(expected)
                }
            }

    private fun Array<out Any>.toFormattedString() =
        asSequence()
            .map {
                when (it) {
                    is IntArray -> it.joinToString(prefix = "[", postfix = "]")
                    else -> it.toString()
                }
            }
            .joinToString()

    private fun createObjectUnderTest() =
        classUnderTest()
            .constructors
            .asSequence()
            .filter { it.parameters.isEmpty() }
            .map { it.call() }
            .first()

    private fun findMethodUnderTest() =
        classUnderTest()
            .functions
            .first()

    protected abstract fun classUnderTest(): KClass<T>
    protected abstract fun input(): List<Pair<Array<out Any>, Any>>
}