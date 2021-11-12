package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class PermutationInString {

    fun checkInclusion(s1: String, s2: String): Boolean {
        val permutation = s1.asSequence()
            .groupingBy { it }
            .eachCount()

        val currentPermutation = s2.asSequence()
            .take(s1.length)
            .groupingBy { it }
            .eachCount()
            .toMutableMap()

        for (i in 1..s2.length - s1.length) {
            if (currentPermutation == permutation) {
                return true
            }

            currentPermutation.compute(s2[i - 1]) { _, previousValue -> (previousValue!! - 1).takeIf { it != 0 } }
            currentPermutation.compute(s2[i + s1.length - 1]) { _, previousValue -> (previousValue ?: 0) + 1 }
        }

        return currentPermutation == permutation
    }
}