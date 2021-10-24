package com.leetcode.test

import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KVisibility
import kotlin.reflect.full.functions

/**
 * @author Maxim Tereshchenko
 */
internal sealed class AlgorithmTest<T : Any, I>(private val classUnderTest: KClass<T>) : BaseTest<I>() {

    protected fun createObjectUnderTest() =
        classUnderTest.constructors
            .asSequence()
            .filter { it.parameters.isEmpty() }
            .map { it.call() }
            .first()

    protected fun findMethodUnderTest(): KFunction<*> {
        return classUnderTest.functions
            .first { it.visibility == KVisibility.PUBLIC }
    }
}

internal abstract class SingleParameterAlgorithmTest<T : Any>(classUnderTest: KClass<T>) :
    AlgorithmTest<T, Any?>(classUnderTest) {

    override fun testCall(input: Any?) = findMethodUnderTest().call(createObjectUnderTest(), input)
}

internal abstract class MultipleParametersAlgorithmTest<T : Any>(classUnderTest: KClass<T>) :
    AlgorithmTest<T, Array<out Any?>>(classUnderTest) {

    override fun Array<out Any?>.formatParameter() = joinToString { it.formatToString() }

    override fun testCall(input: Array<out Any?>) = findMethodUnderTest().call(createObjectUnderTest(), *input)
}
