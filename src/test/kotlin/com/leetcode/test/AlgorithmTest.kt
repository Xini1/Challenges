package com.leetcode.test

import kotlin.reflect.KClass
import kotlin.reflect.full.functions

/**
 * @author Maxim Tereshchenko
 */
internal abstract class AlgorithmTest<T : Any>(private val classUnderTest: KClass<T>) : BaseTest<Array<out Any?>>() {

    private fun createObjectUnderTest() =
        classUnderTest.constructors
            .asSequence()
            .filter { it.parameters.isEmpty() }
            .map { it.call() }
            .first()

    private fun findMethodUnderTest() =
        classUnderTest.functions
            .first()

    override fun Array<out Any?>.formatParameter() =
        asSequence()
            .map {
                when (it) {
                    is IntArray -> it.joinToString(prefix = "[", postfix = "]")
                    else -> it.toString()
                }
            }
            .joinToString()

    override fun testCall(input: Array<out Any?>) = findMethodUnderTest().call(createObjectUnderTest(), *input)
}