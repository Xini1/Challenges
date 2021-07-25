package com.leetcode

import com.leetcode.generic.ListNode

/**
 * @author Maxim Tereshchenko
 */
internal class RemoveDuplicatesFromSortedListTest : BaseTest<RemoveDuplicatesFromSortedList>() {

    override fun classUnderTest() = RemoveDuplicatesFromSortedList::class

    override fun input() =
        listOf(
            intArrayOf(1, 1, 2) to intArrayOf(1, 2),
            intArrayOf(1, 1, 2, 3, 3) to intArrayOf(1, 2, 3),
            intArrayOf() to intArrayOf()
        )
            .map { ListNode.of(it.first) to ListNode.of(it.second) }
            .map { arrayOf(it.first) to it.second }
}