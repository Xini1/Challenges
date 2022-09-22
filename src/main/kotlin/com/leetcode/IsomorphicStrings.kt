package com.leetcode

class IsomorphicStrings {

    fun isIsomorphic(s: String, t: String): Boolean {
        return charPositions(s) == charPositions(t)
    }

    private fun charPositions(str: String): List<List<Int>> {
        return str.asSequence()
            .withIndex()
            .groupBy({ it.value }, { it.index })
            .values
            .toList()
    }
}