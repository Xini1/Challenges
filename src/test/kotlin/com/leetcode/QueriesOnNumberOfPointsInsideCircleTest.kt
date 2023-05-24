package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

internal class QueriesOnNumberOfPointsInsideCircleTest :
    MultipleParametersAlgorithmTest<QueriesOnNumberOfPointsInsideCircle>(QueriesOnNumberOfPointsInsideCircle::class) {

    override fun inputValues() =
        listOf(
            arrayOf(
                arrayOf(intArrayOf(1, 3), intArrayOf(3, 3), intArrayOf(5, 3), intArrayOf(2, 2)),
                arrayOf(intArrayOf(2, 3, 1), intArrayOf(4, 3, 1), intArrayOf(1, 1, 2))
            ) to
                    intArrayOf(3, 2, 2)
        )
}