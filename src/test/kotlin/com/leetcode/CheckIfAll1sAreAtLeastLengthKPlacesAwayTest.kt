package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class CheckIfAll1sAreAtLeastLengthKPlacesAwayTest :
    MultipleParametersAlgorithmTest<CheckIfAll1sAreAtLeastLengthKPlacesAway>(
        CheckIfAll1sAreAtLeastLengthKPlacesAway::class
    ) {

    override fun testValues() =
        listOf(
            arrayOf(intArrayOf(1, 0, 0, 0, 1, 0, 0, 1), 2) to true,
            arrayOf(intArrayOf(1, 0, 0, 1, 0, 1), 2) to false,
            arrayOf(intArrayOf(1, 1, 1, 1, 1), 0) to true,
            arrayOf(intArrayOf(0, 1, 0, 1), 1) to true,
            arrayOf(intArrayOf(0, 0, 0), 2) to true
        )
}