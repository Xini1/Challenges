package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class PascalsTriangleIITest : SingleParameterAlgorithmTest<PascalsTriangleII>(PascalsTriangleII::class) {

    override fun inputValues() =
        listOf(
            3 to listOf(1, 3, 3, 1),
            0 to listOf(1),
            1 to listOf(1, 1)
        )
}