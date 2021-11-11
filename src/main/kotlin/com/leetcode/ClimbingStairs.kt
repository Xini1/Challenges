package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class ClimbingStairs {

    fun climbStairs(n: Int): Int {
        return climbStairsMemoized(n, mutableMapOf(1 to 1, 2 to 2))
    }

    private fun climbStairsMemoized(n: Int, map: MutableMap<Int, Int>): Int {
        if (!map.containsKey(n)) {
            map[n] = climbStairsMemoized(n - 2, map) + climbStairsMemoized(n - 1, map)
        }

        return map[n]!!
    }
}