package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MaximumDifferenceBetweenIncreasingElementsTest :
    SingleParameterAlgorithmTest<MaximumDifferenceBetweenIncreasingElements>(
        MaximumDifferenceBetweenIncreasingElements::class
    ) {

    override fun testValues() =
        listOf(
            intArrayOf(7, 1, 5, 4) to 4,
            intArrayOf(9, 4, 3, 2) to -1,
            intArrayOf(1, 5, 2, 10) to 9
        )
}