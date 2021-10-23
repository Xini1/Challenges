package com.leetcode

import com.leetcode.generic.ListNode
import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MiddleOfTheLinkedListTest : AlgorithmTest<MiddleOfTheLinkedList>(MiddleOfTheLinkedList::class) {

    override fun parameters() =
        listOf(
            intArrayOf(1, 2, 3, 4, 5) to intArrayOf(3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5, 6) to intArrayOf(4, 5, 6),
        )
            .map { ListNode.of(it.first) to ListNode.of(it.second) }
            .map { arrayOf(it.first) to it.second }
}