package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class ReversePrefixOfWord {

    fun reversePrefix(word: String, ch: Char): String {
        val index = word.indexOf(ch)

        if (index == -1) {
            return word
        }

        return word.substring(0..index).reversed() + word.substring(index + 1)
    }
}