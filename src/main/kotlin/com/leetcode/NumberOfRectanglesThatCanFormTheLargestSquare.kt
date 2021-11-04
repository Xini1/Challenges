package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class NumberOfRectanglesThatCanFormTheLargestSquare {

    fun countGoodRectangles(rectangles: Array<IntArray>): Int {
        return rectangles.map { it.minOrNull()!! }
            .run {
                val max = maxOrNull()
                count { it == max }
            }
    }
}