package com.leetcode

class BinaryWatch {

    fun readBinaryWatch(turnedOn: Int): List<String> {
        return generateSequence(Time(), Time::next)
            .take(60 * 12)
            .filter { it.lamps() == turnedOn }
            .map { it.toString() }
            .toList()
    }
}

class Time private constructor(private val hours: Int, private val minutes: Int) {

    constructor() : this(0, 0)

    fun next() =
        if (hours == 11 && minutes == 59) {
            Time(0, 0)
        } else if (minutes == 59) {
            Time(hours + 1, 0)
        } else {
            Time(hours, minutes + 1)
        }

    fun lamps() = hours.countOneBits() + minutes.countOneBits()

    private fun minutesToString() =
        if (minutes < 10) {
            "0$minutes"
        } else {
            minutes.toString()
        }

    override fun toString() = "$hours:${minutesToString()}"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Time

        if (hours != other.hours) return false
        if (minutes != other.minutes) return false

        return true
    }

    override fun hashCode(): Int {
        var result = hours
        result = 31 * result + minutes
        return result
    }
}

