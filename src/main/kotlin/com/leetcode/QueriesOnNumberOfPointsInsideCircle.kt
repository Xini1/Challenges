package com.leetcode

import kotlin.math.pow
import kotlin.math.sqrt

class QueriesOnNumberOfPointsInsideCircle {

    fun countPoints(pointArray: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val points = pointArray.map { (x, y) -> Point(x, y) }
        val circles = queries.map { (x, y, radius) -> Circle(Point(x, y), radius) }
        return circles.map { circle ->
            points.count { point -> circle.contains(point) }
        }
            .toIntArray()
    }
}

data class Point(val x: Int, val y: Int)

data class Circle(private val center: Point, private val radius: Int) {

    fun contains(point: Point): Boolean {
        return Distance(center, point) <= radius
    }
}

data class Distance(private val first: Point, private val second: Point) {

    operator fun compareTo(radius: Int): Int {
        val distanceAsDouble = asDouble()
        return when {
            distanceAsDouble < radius -> -1
            distanceAsDouble > radius -> 1
            else -> 0
        }
    }

    fun asDouble(): Double {
        return sqrt(squared(first.x - second.x) + squared(first.y - second.y))
    }

    private fun squared(num: Int): Double {
        return num.toDouble().pow(2.0)
    }
}