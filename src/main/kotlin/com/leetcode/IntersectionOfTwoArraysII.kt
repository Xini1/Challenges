package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class IntersectionOfTwoArraysII {

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val list2 = nums2.toMutableList()
        val resultedList = mutableListOf<Int>()

        for (num in nums1) {
            if (!list2.contains(num)) {
                continue
            }

            resultedList += num
            list2.remove(num)
        }

        return resultedList.toIntArray()
    }
}