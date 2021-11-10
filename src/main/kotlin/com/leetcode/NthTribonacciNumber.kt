package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class NthTribonacciNumber {

    fun tribonacci(n: Int): Int {
        return tribonacciMemoized(n, mutableMapOf(0 to 0, 1 to 1, 2 to 1))
    }

    private fun tribonacciMemoized(n: Int, map: MutableMap<Int, Int>): Int {
        return map[n] ?: (tribonacciMemoized(n - 3, map) +
                tribonacciMemoized(n - 2, map) +
                tribonacciMemoized(n - 1, map))
            .apply { map[n] = this }
    }
}