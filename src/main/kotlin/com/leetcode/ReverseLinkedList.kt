package com.leetcode

import com.leetcode.generic.ListNode

/**
 * @author Maxim Tereshchenko
 */
class ReverseLinkedList {

    fun reverseList(head: ListNode?): ListNode? {
        var pointer = head
        var newHead: ListNode? = null

        while (pointer != null) {
            val currentNode = pointer
            pointer = pointer.next

            currentNode.next = newHead
            newHead = currentNode
        }

        return newHead
    }
}