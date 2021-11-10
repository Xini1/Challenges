package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class ContainsDuplicate {

    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.asSequence()
            .distinct()
            .count() < nums.size
    }
}