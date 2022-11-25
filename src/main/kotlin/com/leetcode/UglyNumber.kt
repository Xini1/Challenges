package com.leetcode

class UglyNumber {

    fun isUgly(n: Int): Boolean {
        if (n <= 0) {
            return false
        }
        if (n == 1) {
            return true
        }
        return when {
            n % 2 == 0 -> isUgly(n / 2)
            n % 3 == 0 -> isUgly(n / 3)
            n % 5 == 0 -> isUgly(n / 5)
            else -> false
        }
    }
}