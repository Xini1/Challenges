package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class RotateArray {

    fun rotate(nums: IntArray, k: Int) {
        val targetIndex = nums.size - k % nums.size
        (nums.slice(targetIndex until nums.size) + nums.slice(0 until targetIndex))
            .toIntArray()
            .copyInto(nums)
    }
}