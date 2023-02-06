package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

internal class ShuffleTheArrayTest : MultipleParametersAlgorithmTest<ShuffleTheArray>(ShuffleTheArray::class) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(2, 5, 1, 3, 4, 7), 3) to intArrayOf(2, 3, 5, 4, 1, 7),
            arrayOf(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1), 4) to intArrayOf(1, 4, 2, 3, 3, 2, 4, 1),
            arrayOf(intArrayOf(1, 1, 2, 2), 2) to intArrayOf(1, 2, 1, 2)
        )
}