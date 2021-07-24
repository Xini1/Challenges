package com.leetcode

import java.math.BigInteger

/**
 * @author Maxim Tereshchenko
 */
class SqrtX {

    fun mySqrt(x: Int): Int {
        return generateSequence(1) { it + 1 }
            .map { BigInteger.valueOf(it.toLong()) }
            .takeWhile { it.multiply(it) <= BigInteger.valueOf(x.toLong()) }
            .map { it.toInt() }
            .lastOrNull()
            ?: 0
    }
}