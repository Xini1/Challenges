package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class SqrtXTest : AlgorithmTest<SqrtX>(SqrtX::class) {

    override fun parameters() =
        listOf(
            arrayOf(4) to 2,
            arrayOf(8) to 2,
            arrayOf(0) to 0,
            arrayOf(2147395600) to 46340
        )
}