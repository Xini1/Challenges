package com.leetcode.generic

import com.leetcode.test.BaseTest

/**
 * @author Maxim Tereshchenko
 */
internal class ListNodeTest : BaseTest<IntArray>() {

    override fun parameters() =
        listOf(
            intArrayOf(1, 1, 2) to ListNode(1, ListNode(1, ListNode(2))),
            intArrayOf(1, 2) to ListNode(1, ListNode(2)),
            intArrayOf(1, 2, 3) to ListNode(1, ListNode(2, ListNode(3))),
            intArrayOf(1, 1, 2, 3, 3) to
                    ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(3))))),
            intArrayOf() to null
        )

    override fun testCall(input: IntArray) = ListNode.from(input)
}