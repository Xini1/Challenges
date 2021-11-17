package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class PascalsTriangleTest : SingleParameterAlgorithmTest<PascalsTriangle>(PascalsTriangle::class) {

    override fun inputValues() =
        listOf(
            5 to listOf(listOf(1), listOf(1, 1), listOf(1, 2, 1), listOf(1, 3, 3, 1), listOf(1, 4, 6, 4, 1)),
            1 to listOf(listOf(1))
        )
}