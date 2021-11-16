package com.leetcode

import com.leetcode.generic.ListNode

/**
 * @author Maxim Tereshchenko
 */
class MergeTwoSortedLists {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val newHead = ListNode(1)
        var currentNode = newHead
        var pointer1 = l1
        var pointer2 = l2

        while (pointer1 != null && pointer2 != null) {
            if (pointer1.`val` < pointer2.`val`) {
                currentNode.next = pointer1
                pointer1 = pointer1.next
            } else {
                currentNode.next = pointer2
                pointer2 = pointer2.next
            }

            currentNode = currentNode.next!!
        }

        currentNode.next = pointer1 ?: pointer2

        return newHead.next
    }
}