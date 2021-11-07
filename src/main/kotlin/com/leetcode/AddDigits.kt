package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class AddDigits {

    fun addDigits(num: Int): Int {
        val sum = num.toString()
            .asSequence()
            .map(Char::digitToInt)
            .sum()

        if (sum > 9) {
            return addDigits(sum)
        }

        return sum
    }
}