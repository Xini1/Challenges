package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

internal class ContainsDuplicateIITest :
    MultipleParametersAlgorithmTest<ContainsDuplicateII>(ContainsDuplicateII::class) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(1, 2, 3, 1), 3) to true,
            arrayOf(intArrayOf(1, 0, 1, 1), 1) to true,
            arrayOf(intArrayOf(1, 2, 3, 1, 2, 3), 2) to false
        )
}