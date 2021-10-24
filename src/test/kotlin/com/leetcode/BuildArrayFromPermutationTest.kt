package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class BuildArrayFromPermutationTest :
    SingleParameterAlgorithmTest<BuildArrayFromPermutation>(BuildArrayFromPermutation::class) {

    override fun testValues() =
        listOf(
            intArrayOf(0, 2, 1, 5, 3, 4) to intArrayOf(0, 1, 2, 4, 5, 3),
            intArrayOf(5, 0, 1, 2, 3, 4) to intArrayOf(4, 5, 0, 1, 2, 3)
        )
}