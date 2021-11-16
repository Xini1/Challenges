package com.leetcode

import com.leetcode.generic.ListNode
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class ReverseLinkedListTest : SingleParameterAlgorithmTest<ReverseLinkedList>(ReverseLinkedList::class) {

    override fun inputValues() =
        listOf(
            intArrayOf(1, 2, 3, 4, 5) to intArrayOf(5, 4, 3, 2, 1),
            intArrayOf(1, 2) to intArrayOf(2, 1),
            intArrayOf() to intArrayOf()
        )
            .map { ListNode.from(it.first) to ListNode.from(it.second) }
}