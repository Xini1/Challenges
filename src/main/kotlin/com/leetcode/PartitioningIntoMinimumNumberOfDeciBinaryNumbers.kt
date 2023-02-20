package com.leetcode

class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    fun minPartitions(n: String): Int {
        return n.asSequence()
            .maxOrNull()
            ?.digitToInt() ?: 0
    }
}