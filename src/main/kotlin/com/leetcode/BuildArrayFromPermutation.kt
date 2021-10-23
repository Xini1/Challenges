package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class BuildArrayFromPermutation {

    fun buildArray(nums: IntArray): IntArray {
        return nums.indices
            .asSequence()
            .map { nums[nums[it]] }
            .toList()
            .toIntArray()
    }
}