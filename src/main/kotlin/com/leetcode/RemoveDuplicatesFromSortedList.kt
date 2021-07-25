package com.leetcode

import com.leetcode.generic.ListNode

/**
 * @author Maxim Tereshchenko
 */
class RemoveDuplicatesFromSortedList {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        return generateSequence(head) { it.next }
            .map { it.`val` }
            .distinct()
            .map { ListNode(it) }
            .reduce() { node, nextNode ->
                node.also {
                    generateSequence(it) { seed -> seed.next }
                        .last()
                        .also { last -> last.next = nextNode }
                }
            }
    }
}