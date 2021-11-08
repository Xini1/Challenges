package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class SquaresOfASortedArray {

    fun sortedSquares(nums: IntArray): IntArray {
        return nums.asSequence()
            .map { it * it }
            .sorted()
            .toList()
            .toIntArray()
    }
}