package com.leetcode

import java.math.BigInteger

/**
 * @author Maxim Tereshchenko
 */
class AddBinary {

    fun addBinary(a: String, b: String): String {
        return BigInteger(a, 2).plus(BigInteger(b, 2)).toString(2)
    }
}