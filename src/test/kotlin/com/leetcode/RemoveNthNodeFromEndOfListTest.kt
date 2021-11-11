package com.leetcode

import com.leetcode.generic.ListNode
import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class RemoveNthNodeFromEndOfListTest :
    MultipleParametersAlgorithmTest<RemoveNthNodeFromEndOfList>(RemoveNthNodeFromEndOfList::class) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(1, 2, 3, 4, 5), 2) to intArrayOf(1, 2, 3, 5),
            arrayOf(intArrayOf(1), 1) to intArrayOf(),
            arrayOf(intArrayOf(1, 2), 1) to intArrayOf(1)
        )
            .map { arrayOf(ListNode.from(it.first[0] as IntArray), it.first[1]) to ListNode.from(it.second) }
}