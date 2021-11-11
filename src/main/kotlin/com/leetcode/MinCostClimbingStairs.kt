package com.leetcode

import kotlin.math.min

/**
 * @author Maxim Tereshchenko
 */
class MinCostClimbingStairs {

    fun minCostClimbingStairs(cost: IntArray): Int {
        return minCostRecursively(intArrayOf(0) + cost, 0, mutableMapOf())
    }

    private fun minCostRecursively(
        cost: IntArray,
        currentPosition: Int,
        cache: MutableMap<Int, Int>
    ): Int {
        if (!cache.containsKey(currentPosition)) {
            cache[currentPosition] = cost[currentPosition] +
                    if (currentPosition in (cost.size - 2) until cost.size) {
                        0
                    } else {
                        min(
                            minCostRecursively(
                                cost,
                                currentPosition + 1,
                                cache
                            ),
                            minCostRecursively(
                                cost,
                                currentPosition + 2,
                                cache
                            )
                        )
                    }
        }

        return cache[currentPosition]!!
    }
}