package com.leetcode

import com.leetcode.generic.ListNode
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class RemoveDuplicatesFromSortedListTest :
    SingleParameterAlgorithmTest<RemoveDuplicatesFromSortedList>(RemoveDuplicatesFromSortedList::class) {

    override fun testValues() =
        listOf(
            intArrayOf(1, 1, 2) to intArrayOf(1, 2),
            intArrayOf(1, 1, 2, 3, 3) to intArrayOf(1, 2, 3),
            intArrayOf() to intArrayOf()
        )
            .map { ListNode.from(it.first) to ListNode.from(it.second) }
}