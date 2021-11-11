package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class TwoSum {

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for (i in numbers.indices) {
            val remaining = target - numbers[i]

            if (map.containsKey(remaining)) {
                return intArrayOf(map[remaining]!!, i)
            }

            map[numbers[i]] = i
        }

        throw IllegalArgumentException()
    }
}