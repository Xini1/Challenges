package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class DistributeCandiesToPeopleTest :
    AlgorithmTest<DistributeCandiesToPeople>(DistributeCandiesToPeople::class) {

    override fun parameters() =
        listOf(
            arrayOf(7, 4) to arrayOf(1, 2, 3, 1).toIntArray(),
            arrayOf(10, 3) to arrayOf(5, 2, 3).toIntArray()
        )
}