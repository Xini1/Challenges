package com.leetcode

class WordPattern {

    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        if (pattern.length != words.size) {
            return false
        }
        val mappings = mutableMapOf<Char, String>()
        for (index in pattern.indices) {
            if (!mappings.containsKey(pattern[index])) {
                if (mappings.containsValue(words[index])) {
                    return false
                }
                mappings[pattern[index]] = words[index]
                continue
            }
            if (mappings[pattern[index]] != words[index]) {
                return false
            }
        }
        return true
    }
}