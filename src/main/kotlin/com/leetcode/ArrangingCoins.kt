package com.leetcode

class ArrangingCoins {

    fun arrangeCoins(n: Int): Int {
        var left = n
        var nextRowLength = 1
        while (true) {
            if (left < nextRowLength) {
                return nextRowLength - 1
            }
            left -= nextRowLength
            nextRowLength++
        }
    }
}