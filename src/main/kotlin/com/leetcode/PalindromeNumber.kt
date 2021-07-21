package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        return x.toString()
            .run { equals(reversed()) }
    }
}