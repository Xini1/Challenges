package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class FirstBadVersionTest : MultipleParametersAlgorithmTest<FirstBadVersion>(FirstBadVersion::class) {

    override fun testValues() =
        listOf(
            arrayOf(5, 4) to 4,
            arrayOf(1, 1) to 1,
            arrayOf(2, 1) to 1,
            arrayOf(3, 3) to 3,
            arrayOf(2126753390, 1702766719) to 1702766719
        )
}