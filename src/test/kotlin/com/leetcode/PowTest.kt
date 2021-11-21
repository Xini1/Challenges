package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class PowTest : MultipleParametersAlgorithmTest<Pow>(Pow::class) {
    override fun inputValues() =
        listOf(
            arrayOf(2.0, 10) to 1024.0,
            arrayOf(2.1, 3) to 9.261000000000001,
            arrayOf(2.0, -2) to 0.25
        )
}