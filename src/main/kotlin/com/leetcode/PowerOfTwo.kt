package com.leetcode

import java.math.BigDecimal

class PowerOfTwo {

    fun isPowerOfTwo(n: Int): Boolean {
        var power = 0
        var powered: Long
        do {
            powered = BigDecimal(2.0).pow(power).toLong()
            power++
        } while (powered < n)
        return powered == n.toLong()
    }
}