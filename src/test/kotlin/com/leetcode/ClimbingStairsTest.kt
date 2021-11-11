package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class ClimbingStairsTest : SingleParameterAlgorithmTest<ClimbingStairs>(ClimbingStairs::class) {

    override fun inputValues() =
        listOf(
            1 to 1,
            2 to 2,
            3 to 3,
            4 to 5,
            44 to 1134903170
        )
}