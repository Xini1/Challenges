package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class DistributeCandiesToPeopleTest :
    MultipleParametersAlgorithmTest<DistributeCandiesToPeople>(DistributeCandiesToPeople::class) {

    override fun testValues() =
        listOf(
            arrayOf(7, 4) to intArrayOf(1, 2, 3, 1),
            arrayOf(10, 3) to intArrayOf(5, 2, 3)
        )
}