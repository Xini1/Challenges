package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class ReverseWordsInAStringIII {

    fun reverseWords(s: String): String {
        return s.split(' ')
            .asSequence()
            .map { it.reversed() }
            .joinToString(" ")
    }
}