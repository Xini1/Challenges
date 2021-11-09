package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class MoveZeroes {

    fun moveZeroes(nums: IntArray): Unit {
        val array = nums.asSequence()
            .filter { it != 0 }
            .toList()
            .toIntArray()

        nums.fill(0)
        array.copyInto(nums)
    }
}