package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class IntersectionOfTwoArraysIITest :
    MultipleParametersAlgorithmTest<IntersectionOfTwoArraysII>(IntersectionOfTwoArraysII::class) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)) to intArrayOf(2, 2),
            arrayOf(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)) to intArrayOf(4, 9)
        )
}