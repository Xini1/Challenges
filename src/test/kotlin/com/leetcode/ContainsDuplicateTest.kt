package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class ContainsDuplicateTest : SingleParameterAlgorithmTest<ContainsDuplicate>(ContainsDuplicate::class) {

    override fun inputValues() =
        listOf(
            intArrayOf(1, 2, 3, 1) to true,
            intArrayOf(1, 2, 3, 4) to false,
            intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2) to true
        )
}