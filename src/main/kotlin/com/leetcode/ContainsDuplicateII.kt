package com.leetcode

import kotlin.math.abs

class ContainsDuplicateII {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val memory = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val number = nums[i]
            if (number in memory && abs(memory[number]!! - i) <= k) {
                return true
            }
            memory[number] = i
        }
        return false
    }
}