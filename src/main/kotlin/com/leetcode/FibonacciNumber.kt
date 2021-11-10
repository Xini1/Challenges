package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class FibonacciNumber {

    fun fib(n: Int): Int {
        if (n in 0..1) {
            return n
        }

        return fib(n - 2) + fib(n - 1)
    }
}