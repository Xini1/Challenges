package com.leetcode

import kotlin.math.absoluteValue

/**
 * @author Maxim Tereshchenko
 */
class MinimumNumberOfMovesToSeatEveryone {

    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        return seats.asSequence()
            .sorted()
            .zip(students.asSequence().sorted())
            .map { it.first - it.second }
            .map { it.absoluteValue }
            .sum()
    }
}