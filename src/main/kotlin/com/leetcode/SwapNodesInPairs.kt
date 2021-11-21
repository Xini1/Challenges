package com.leetcode

import com.leetcode.generic.ListNode

/**
 * @author Maxim Tereshchenko
 */
class SwapNodesInPairs {

    fun swapPairs(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }
        val newHead = head.next
        newHead?.next = head.apply { next = swapPairs(newHead?.next) }

        return newHead
    }
}