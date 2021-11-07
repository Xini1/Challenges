package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class MaximumDifferenceBetweenIncreasingElements {

    fun maximumDifference(nums: IntArray): Int {
        return nums.asSequence()
            .withIndex()
            .map { (index, value) -> (nums.slice((index + 1) until nums.size).maxOrNull() ?: 0) - value }
            .filter { it > 0 }
            .maxOrNull()
            ?: -1
    }
}