package com.leetcode

import com.leetcode.generic.Node
import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class NaryTreePreorderTraversalTest :
    SingleParameterAlgorithmTest<NaryTreePreorderTraversal>(NaryTreePreorderTraversal::class) {

    override fun testValues() =
        listOf(
            arrayOf(1, null, 3, 2, 4, null, 5, 6) to listOf(1, 3, 5, 6, 2, 4),
            arrayOf(
                1,
                null,
                2,
                3,
                4,
                5,
                null,
                null,
                6,
                7,
                null,
                8,
                null,
                9,
                10,
                null,
                null,
                11,
                null,
                12,
                null,
                13,
                null,
                null,
                14
            ) to listOf(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10)
        )
            .map { Node.from(it.first) to it.second }
}