package com.leetcode

import kotlin.math.max

/**
 * @author Maxim Tereshchenko
 */
class MaximumSubarray {

    fun maxSubArray(nums: IntArray): Int {
        var currentSum = 0
        var maxSum = Int.MIN_VALUE

        for (num in nums) {
            currentSum = max(num, currentSum + num)

            if (currentSum > maxSum) {
                maxSum = currentSum
            }
        }

        return maxSum
    }
}