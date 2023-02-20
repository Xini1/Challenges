package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

internal class SubrectangleQueriesTest :
    MultipleParametersAlgorithmTest<SubrectangleQueries>(SubrectangleQueries::class) {

    override fun inputValues() =
        listOf(
            arrayOf<Any>(
                arrayOf(
                    "SubrectangleQueries",
                    "getValue",
                    "updateSubrectangle",
                    "getValue",
                    "getValue",
                    "updateSubrectangle",
                    "getValue",
                    "getValue"
                ),
                arrayOf<Any>(
                    arrayOf(intArrayOf(1, 2, 1), intArrayOf(4, 3, 4), intArrayOf(3, 2, 1), intArrayOf(1, 1, 1)),
                    intArrayOf(0, 2),
                    intArrayOf(0, 0, 3, 2, 5),
                    intArrayOf(0, 2),
                    intArrayOf(3, 1),
                    intArrayOf(3, 0, 3, 2, 10),
                    intArrayOf(3, 1),
                    intArrayOf(0, 2)
                )
            ) to arrayOf(null, 1, null, 5, 5, null, 10, 5)
        )
}