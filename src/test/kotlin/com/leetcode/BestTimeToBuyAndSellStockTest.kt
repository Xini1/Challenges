package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class BestTimeToBuyAndSellStockTest :
    SingleParameterAlgorithmTest<BestTimeToBuyAndSellStock>(BestTimeToBuyAndSellStock::class) {

    override fun inputValues() =
        listOf(
            intArrayOf(7, 1, 5, 3, 6, 4) to 5,
            intArrayOf(7, 6, 4, 3, 1) to 0
        )
}