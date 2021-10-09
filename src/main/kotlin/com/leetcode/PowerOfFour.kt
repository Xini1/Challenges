package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class PowerOfFour {

    fun isPowerOfFour(n: Int): Boolean {
        var power = 0
        val underTest = n.toBigInteger()

        do {
            val powerOfFour = 4.toBigInteger().pow(power)

            if (powerOfFour > underTest) {
                return false
            }

            power++
        } while (powerOfFour != underTest)

        return true
    }
}