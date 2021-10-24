package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class RectangleOverlapTest : MultipleParametersAlgorithmTest<RectangleOverlap>(RectangleOverlap::class) {

    override fun testValues() =
        listOf(
            arrayOf(intArrayOf(0, 0, 2, 2), intArrayOf(1, 1, 3, 3)) to true,
            arrayOf(intArrayOf(0, 0, 1, 1), intArrayOf(1, 0, 2, 1)) to false,
            arrayOf(intArrayOf(0, 0, 1, 1), intArrayOf(2, 2, 3, 3)) to false,
            arrayOf(intArrayOf(7, 8, 13, 15), intArrayOf(10, 8, 12, 20)) to true,
            arrayOf(
                intArrayOf(-836959955, -724514313, 368220652, -449465289),
                intArrayOf(-703416829, -64916327, 713807924, 838108468)
            ) to false
        )
}