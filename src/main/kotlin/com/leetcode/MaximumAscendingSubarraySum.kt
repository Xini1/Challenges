package com.leetcode

import kotlin.math.max

/**
 * @author Maxim Tereshchenko
 */
class MaximumAscendingSubarraySum {

    fun maxAscendingSum(nums: IntArray): Int {
        var highestSum = Int.MIN_VALUE
        var currentSum = nums[0]

        for (index in 1 until nums.size) {
            if (nums[index] > nums[index - 1]) {
                currentSum += nums[index]
            } else {
                if (currentSum > highestSum) {
                    highestSum = currentSum
                }

                currentSum = nums[index]
            }
        }

        return max(currentSum, highestSum)
    }
}