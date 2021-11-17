package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class ReshapeTheMatrixTest : MultipleParametersAlgorithmTest<ReshapeTheMatrix>(ReshapeTheMatrix::class) {

    override fun inputValues() =
        listOf(
            arrayOf(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 1, 4) to arrayOf(intArrayOf(1, 2, 3, 4)),
            arrayOf(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 2, 4) to arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        )
}