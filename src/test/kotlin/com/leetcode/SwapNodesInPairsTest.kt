package com.leetcode

import com.leetcode.generic.ListNode
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class SwapNodesInPairsTest : SingleParameterAlgorithmTest<SwapNodesInPairs>(SwapNodesInPairs::class) {

    override fun inputValues() =
        listOf(
            intArrayOf(1, 2, 3, 4) to intArrayOf(2, 1, 4, 3),
            intArrayOf(1) to intArrayOf(1),
            intArrayOf() to intArrayOf(),
        )
            .map { ListNode.from(it.first) to ListNode.from(it.second) }
}