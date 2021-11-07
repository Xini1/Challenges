package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class BinarySearch {

    fun search(nums: IntArray, target: Int): Int {
        return search(nums, target, 0)
    }

    private fun search(nums: IntArray, target: Int, offset: Int): Int {
        if (nums.isEmpty()) {
            return -1
        }

        val middleIndex = nums.size / 2
        val middleValue = nums[middleIndex]

        return when {
            middleValue == target -> middleIndex + offset
            middleValue < target -> search(
                nums.sliceArray((middleIndex + 1) until nums.size),
                target,
                offset + middleIndex + 1
            )
            middleValue > target -> search(nums.sliceArray(0 until middleIndex), target, offset)
            else -> -1
        }
    }
}