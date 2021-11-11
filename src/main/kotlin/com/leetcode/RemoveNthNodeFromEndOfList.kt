package com.leetcode

import com.leetcode.generic.ListNode

/**
 * @author Maxim Tereshchenko
 */
class RemoveNthNodeFromEndOfList {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var previous = head ?: return null
        var target = previous.next ?: return null
        var next = target.next

        val positionFromStart = generateSequence({ head }) { it.next }
            .count() - n + 1

        if (positionFromStart == 1) {
            return target
        }

        for (i in 2 until positionFromStart) {
            previous = previous.next!!
            target = target.next!!
            next = next?.next
        }

        previous.next = next

        return head
    }
}