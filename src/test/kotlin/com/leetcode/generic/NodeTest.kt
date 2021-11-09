package com.leetcode.generic

import com.leetcode.test.BaseTest

/**
 * @author Maxim Tereshchenko
 */
internal class NodeTest : BaseTest<Array<Int?>>() {

    override fun inputValues() =
        listOf(
            arrayOf(1, null, 3, 2, 4, null, 5, 6) to
                    Node(
                        1,
                        listOf(
                            Node(
                                3,
                                listOf(
                                    Node(5),
                                    Node(6)
                                )
                            ),
                            Node(2),
                            Node(4)
                        )
                    ),
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
            ) to Node(
                1,
                listOf(
                    Node(2),
                    Node(
                        3,
                        listOf(
                            Node(6),
                            Node(
                                7,
                                listOf(
                                    Node(
                                        11,
                                        listOf(
                                            Node(14)
                                        )
                                    )
                                )
                            )
                        )
                    ),
                    Node(
                        4,
                        listOf(
                            Node(
                                8,
                                listOf(
                                    Node(12)
                                )
                            )
                        )
                    ),
                    Node(
                        5,
                        listOf(
                            Node(
                                9,
                                listOf(
                                    Node(13)
                                )
                            ),
                            Node(10)
                        )
                    )
                )
            )
        )

    override fun testCall(input: Array<Int?>) = Node.from(input)
}