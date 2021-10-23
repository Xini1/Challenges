package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class CountingBits {

    fun countBits(n: Int): IntArray {
        return (0..n).asSequence()
            .map { Integer.bitCount(it) }
            .toList()
            .toIntArray()
    }
}