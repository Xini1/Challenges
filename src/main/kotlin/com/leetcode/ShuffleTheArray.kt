package com.leetcode

class ShuffleTheArray {

    fun shuffle(nums: IntArray, n: Int): IntArray {
        return (0 until n).asSequence()
            .flatMap { sequenceOf(nums[it], nums[it + n]) }
            .toList()
            .toIntArray()
    }
}