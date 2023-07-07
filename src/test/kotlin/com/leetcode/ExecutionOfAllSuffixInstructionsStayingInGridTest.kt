package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

internal class ExecutionOfAllSuffixInstructionsStayingInGridTest :
    MultipleParametersAlgorithmTest<ExecutionOfAllSuffixInstructionsStayingInGrid>(
        ExecutionOfAllSuffixInstructionsStayingInGrid::class
    ) {

    override fun inputValues() =
        listOf(
            arrayOf(3, intArrayOf(0, 1), "RRDDLU") to intArrayOf(1, 5, 4, 3, 1, 0),
            arrayOf(2, intArrayOf(1, 1), "LURD") to intArrayOf(4, 1, 0, 0),
            arrayOf(1, intArrayOf(0, 0), "LRUD") to intArrayOf(0, 0, 0, 0)
        )
}