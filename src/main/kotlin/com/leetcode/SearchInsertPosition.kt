package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int {
        return nums.asSequence()
            .withIndex()
            .dropWhile { (_, value) -> value < target }
            .map { (index, _) -> index }
            .firstOrNull()
            ?: nums.size
    }
}