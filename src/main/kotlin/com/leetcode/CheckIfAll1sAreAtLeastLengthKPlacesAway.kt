package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class CheckIfAll1sAreAtLeastLengthKPlacesAway {

    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        val indexOfFirstOne = nums.indexOf(1)

        if (indexOfFirstOne == -1) {
            return true
        }

        var currentLength = Int.MAX_VALUE

        for (number in nums.slice(indexOfFirstOne until nums.size)) {
            if (number == 0) {
                currentLength++
            } else {
                if (currentLength < k) {
                    return false
                }

                currentLength = 0
            }
        }

        return true
    }
}