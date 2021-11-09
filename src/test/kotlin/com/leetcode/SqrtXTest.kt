package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class SqrtXTest : SingleParameterAlgorithmTest<SqrtX>(SqrtX::class) {

    override fun inputValues() =
        listOf(
            4 to 2,
            8 to 2,
            0 to 0,
            2147395600 to 46340
        )
}