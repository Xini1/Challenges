package com.leetcode

import com.leetcode.test.MutableSingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MoveZeroesTest : MutableSingleParameterAlgorithmTest<MoveZeroes>(MoveZeroes::class) {

    override fun inputValues() =
        listOf(
            intArrayOf(0, 1, 0, 3, 12) to intArrayOf(1, 3, 12, 0, 0),
            intArrayOf(0) to intArrayOf(0)
        )
}