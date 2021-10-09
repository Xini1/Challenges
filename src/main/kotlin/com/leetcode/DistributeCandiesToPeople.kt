package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class DistributeCandiesToPeople {

    fun distributeCandies(candies: Int, numPeople: Int): IntArray {
        val result = IntArray(numPeople)
        var distributed = 0
        var round = 1

        while (distributed != candies) {
            val amountToGive = amountToGive(round, distributed, candies)
            result[(round - 1) % numPeople] += amountToGive

            distributed += amountToGive
            round++
        }

        return result
    }

    private fun amountToGive(round: Int, distributed: Int, candies: Int): Int {
        val remaining = candies - distributed
        if (round > remaining) {
            return remaining
        }

        return round
    }
}