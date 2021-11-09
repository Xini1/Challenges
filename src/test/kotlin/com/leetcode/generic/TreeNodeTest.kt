package com.leetcode.generic

import com.leetcode.test.BaseTest

/**
 * @author Maxim Tereshchenko
 */
internal class TreeNodeTest : BaseTest<Array<Int?>>() {

    override fun inputValues(): List<Pair<Array<Int?>, Any?>> =
        listOf(
            arrayOf<Int?>(1, 2, 3) to TreeNode(1, TreeNode(2), TreeNode(3)),
            arrayOf<Int?>(1, 2) to TreeNode(1, TreeNode(2)),
            arrayOf(1, null, 2) to TreeNode(1, right = TreeNode(2)),
            arrayOf(3, 9, 20, null, null, 15, 7) to
                    TreeNode(
                        3,
                        TreeNode(9),
                        TreeNode(
                            20,
                            TreeNode(15),
                            TreeNode(7)
                        )
                    ),
            arrayOf(1, 2, 2, 3, 3, null, null, 4, 4) to
                    TreeNode(
                        1,
                        TreeNode(
                            2,
                            TreeNode(
                                3,
                                TreeNode(4),
                                TreeNode(4)
                            ),
                            TreeNode(3)
                        ),
                        TreeNode(2)
                    )
        )

    override fun testCall(input: Array<Int?>) = TreeNode.from(input)
}