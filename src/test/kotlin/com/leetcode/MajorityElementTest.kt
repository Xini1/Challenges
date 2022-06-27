package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MajorityElementTest : SingleParameterAlgorithmTest<MajorityElement>(MajorityElement::class) {

    override fun inputValues() =
        listOf(
            intArrayOf(3, 2, 3) to 3,
            intArrayOf(2, 2, 1, 1, 1, 2, 2) to 2
        )
}