package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class LongestSubstringWithoutRepeatingCharacters {

    fun lengthOfLongestSubstring(s: String): Int {
        val uniqueList: MutableList<Char> = mutableListOf()
        var longestLength = 0

        for (char in s) {
            if (char in uniqueList) {
                uniqueList.removeAll(uniqueList.subList(0, uniqueList.indexOf(char) + 1))
            }

            uniqueList += char

            if (uniqueList.size > longestLength) {
                longestLength = uniqueList.size
            }
        }

        return longestLength
    }
}