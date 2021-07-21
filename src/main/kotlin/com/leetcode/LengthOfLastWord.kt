package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class LengthOfLastWord {

    fun lengthOfLastWord(s: String): Int {
        return s.trim()
            .reversed()
            .asSequence()
            .takeWhile { it != ' ' }
            .count()
    }
}