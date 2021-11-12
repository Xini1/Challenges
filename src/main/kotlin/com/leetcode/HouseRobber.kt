package com.leetcode

import kotlin.math.max

/**
 * @author Maxim Tereshchenko
 */
class HouseRobber {

    fun rob(nums: IntArray): Int {
        return robMemoized(nums, nums.size - 1, mutableMapOf(-2 to 0, -1 to 0))
    }

    fun robMemoized(nums: IntArray, index: Int, map: MutableMap<Int, Int>): Int {
        if (!map.containsKey(index)) {
            map[index] = max(
                nums[index] + robMemoized(nums, index - 2, map),
                robMemoized(nums, index - 1, map)
            )
        }

        return map[index]!!
    }
}