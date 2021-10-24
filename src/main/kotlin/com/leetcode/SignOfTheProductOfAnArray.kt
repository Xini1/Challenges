package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class SignOfTheProductOfAnArray {

    fun arraySign(nums: IntArray): Int {
        var negatives = 0

        for (num in nums) {
            if (num == 0) {
                return 0
            }

            if (num < 0) {
                negatives++
            }
        }

        return if (negatives % 2 == 0) {
            1
        } else {
            -1
        }
    }
}