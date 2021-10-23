package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class BuildArrayFromPermutationTest :
    AlgorithmTest<BuildArrayFromPermutation>(BuildArrayFromPermutation::class) {

    override fun parameters() =
        listOf(
            intArrayOf(0, 2, 1, 5, 3, 4) to intArrayOf(0, 1, 2, 4, 5, 3),
            intArrayOf(5, 0, 1, 2, 3, 4) to intArrayOf(4, 5, 0, 1, 2, 3)
        )
            .map { arrayOf(it.first) to it.second }
}