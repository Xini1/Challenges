package com.leetcode

import com.leetcode.generic.ListNode
import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class RemoveDuplicatesFromSortedListTest :
    AlgorithmTest<RemoveDuplicatesFromSortedList>(RemoveDuplicatesFromSortedList::class) {

    override fun parameters() =
        listOf(
            intArrayOf(1, 1, 2) to intArrayOf(1, 2),
            intArrayOf(1, 1, 2, 3, 3) to intArrayOf(1, 2, 3),
            intArrayOf() to intArrayOf()
        )
            .map { ListNode.of(it.first) to ListNode.of(it.second) }
            .map { arrayOf(it.first) to it.second }
}