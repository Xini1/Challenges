package com.leetcode

import com.leetcode.generic.ListNode
import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MergeTwoSortedListsTest :
    MultipleParametersAlgorithmTest<MergeTwoSortedLists>(MergeTwoSortedLists::class) {

    override fun inputValues() =
        listOf(
            arrayOf(intArrayOf(1, 2, 4), intArrayOf(1, 3, 4)) to intArrayOf(1, 1, 2, 3, 4, 4),
            arrayOf(intArrayOf(), intArrayOf()) to intArrayOf(),
            arrayOf(intArrayOf(), intArrayOf(0)) to intArrayOf(0),
            arrayOf(intArrayOf(2), intArrayOf(1)) to intArrayOf(1, 2)
        )
            .map { arrayOf(ListNode.from(it.first[0]), ListNode.from(it.first[1])) to ListNode.from(it.second) }
}