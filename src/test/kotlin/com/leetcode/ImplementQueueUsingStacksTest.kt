package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

internal class ImplementQueueUsingStacksTest :
    MultipleParametersAlgorithmTest<ImplementQueueUsingStacks>(ImplementQueueUsingStacks::class) {

    override fun inputValues() =
        listOf(
            arrayOf(
                arrayOf("MyQueue", "push", "push", "peek", "pop", "empty"),
                arrayOf(null, 1, 2, null, null, null)
            ) to arrayOf(null, null, null, 1, 1, false)
        )
}