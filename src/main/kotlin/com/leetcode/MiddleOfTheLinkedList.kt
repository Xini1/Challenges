package com.leetcode

import com.leetcode.generic.ListNode

/**
 * @author Maxim Tereshchenko
 */
class MiddleOfTheLinkedList {

    fun middleNode(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        var slow = head
        var fast = head

        while (true) {
            fast = fast?.next

            if (fast == null) {
                return slow
            }

            fast = fast.next

            if (fast == null) {
                return slow?.next
            }

            slow = slow?.next
        }
    }
}