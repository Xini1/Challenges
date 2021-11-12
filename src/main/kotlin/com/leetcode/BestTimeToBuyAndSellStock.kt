package com.leetcode

import kotlin.math.max

/**
 * @author Maxim Tereshchenko
 */
class BestTimeToBuyAndSellStock {

    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else {
                maxProfit = max(maxProfit, price - minPrice)
            }
        }

        return maxProfit
    }
}