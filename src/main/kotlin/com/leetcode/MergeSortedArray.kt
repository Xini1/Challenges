package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        (nums1.asSequence().take(m) + nums2.asSequence())
            .sorted()
            .toList()
            .toIntArray()
            .copyInto(nums1)
    }
}