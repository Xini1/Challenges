package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

internal class RangeSumQueryImmutableTest :
    MultipleParametersAlgorithmTest<RangeSumQueryImmutable>(RangeSumQueryImmutable::class) {

    override fun inputValues() =
        listOf(
            arrayOf(
                arrayOf("NumArray", "sumRange", "sumRange", "sumRange"),
                arrayOf(intArrayOf(-2, 0, 3, -5, 2, -1), intArrayOf(0, 2), intArrayOf(2, 5), intArrayOf(0, 5))
            ) to
                    arrayOf(null, 1, -1, -3)
        )
}