package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        return nums.asSequence()
            .groupingBy { it }
            .eachCount()
            .asSequence()
            .maxByOrNull { it.value }!!
            .key
    }
}