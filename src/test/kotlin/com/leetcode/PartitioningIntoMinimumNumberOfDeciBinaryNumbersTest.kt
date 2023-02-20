package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest :
    SingleParameterAlgorithmTest<PartitioningIntoMinimumNumberOfDeciBinaryNumbers>(
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers::class
    ) {
    override fun inputValues() =
        listOf(
            "32" to 3,
            "82734" to 8,
            "27346209830709182346" to 9
        )
}