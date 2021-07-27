package com.leetcode.test

import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KVisibility
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

    private fun findMethodUnderTest(): KFunction<*> {
        return classUnderTest.functions
            .first { it.visibility == KVisibility.PUBLIC }
    }


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
