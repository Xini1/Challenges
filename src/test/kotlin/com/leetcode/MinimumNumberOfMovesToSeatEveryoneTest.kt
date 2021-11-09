package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MinimumNumberOfMovesToSeatEveryoneTest :
    MultipleParametersAlgorithmTest<MinimumNumberOfMovesToSeatEveryone>(MinimumNumberOfMovesToSeatEveryone::class) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(3, 1, 5), intArrayOf(2, 7, 4)) to 4,
            arrayOf(intArrayOf(4, 1, 5, 9), intArrayOf(1, 3, 2, 6)) to 7,
            arrayOf(intArrayOf(2, 2, 6, 6), intArrayOf(1, 3, 2, 6)) to 4
        )
}