package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class CheckIfAll1sAreAtLeastLengthKPlacesAwayTest :
    AlgorithmTest<CheckIfAll1sAreAtLeastLengthKPlacesAway>(CheckIfAll1sAreAtLeastLengthKPlacesAway::class) {

    override fun parameters() =
        listOf(
            arrayOf(intArrayOf(1, 0, 0, 0, 1, 0, 0, 1), 2) to true,
            arrayOf(intArrayOf(1, 0, 0, 1, 0, 1), 2) to false,
            arrayOf(intArrayOf(1, 1, 1, 1, 1), 0) to true,
            arrayOf(intArrayOf(0, 1, 0, 1), 1) to true,
            arrayOf(intArrayOf(0, 0, 0), 2) to true
        )
}