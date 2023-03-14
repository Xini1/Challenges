package com.leetcode

class StrictlyPalindromicNumber {

    fun isStrictlyPalindromic(n: Int): Boolean {
        return (2..n - 2).asSequence()
            .map { NumberWithBase.from(n, it) }
            .all {
                it.isPalindromic()
            }
    }
}

class NumberWithBase private constructor(private val value: List<Int>, val base: Int) {

    companion object {
        fun from(base10Value: Int, base: Int): NumberWithBase {
            var result = NumberWithBase(listOf(0), base)
            repeat(base10Value) {
                result = result.incremented()
            }
            return result
        }
    }

    private fun incremented(): NumberWithBase {
        val copy = value.toMutableList()
        for (index in copy.indices.reversed()) {
            val incrementedRegister = copy[index] + 1
            if (incrementedRegister < base) {
                copy[index] = incrementedRegister
                return NumberWithBase(copy, base)
            }
            copy[index] = 0
        }
        copy.add(0, 1)
        return NumberWithBase(copy, base)
    }

    fun isPalindromic(): Boolean {
        val string = toString()
        return string == string.reversed()
    }

    override fun toString(): String {
        return value.joinToString("")
    }
}