package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

internal class ImplementStackUsingQueuesTest :
    MultipleParametersAlgorithmTest<ImplementStackUsingQueues>(ImplementStackUsingQueues::class) {

    override fun inputValues() =
        listOf(
            arrayOf(arrayOf("MyStack", "push", "push", "top", "pop", "empty"), arrayOf(null, 1, 2, null, null, null)) to
                    arrayOf(null, null, null, 2, 2, false)
        )
}