package com.leetcode

class HappyNumber {

    fun isHappy(n: Int): Boolean {
        return isHappyMemoized(n, emptySet())
    }

    private fun isHappyMemoized(n: Int, seenNumbers: Set<Int>): Boolean {
        val newNumber = n.toString()
            .splitToSequence("")
            .filter { it.isNotEmpty() }
            .map { it.toInt() }
            .map { it * it }
            .sum()
        if (newNumber == 1) {
            return true
        }
        if (newNumber in seenNumbers) {
            return false
        }
        return isHappyMemoized(newNumber, seenNumbers + newNumber)
    }
}