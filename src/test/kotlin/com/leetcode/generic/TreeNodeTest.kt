package com.leetcode.generic

import com.leetcode.test.BaseTest

/**
 * @author Maxim Tereshchenko
 */
internal class TreeNodeTest : BaseTest<Array<Int?>>() {

    override fun parameters(): List<Pair<Array<Int?>, Any?>> =
        listOf(
            arrayOf<Int?>(1, 2, 3) to TreeNode(1, TreeNode(2), TreeNode(3)),
            arrayOf<Int?>(1, 2) to TreeNode(1, TreeNode(2)),
            arrayOf(1, null, 2) to TreeNode(1, right = TreeNode(2)),
        )

    override fun testCall(input: Array<Int?>) = TreeNode.of(input)
    override fun Array<Int?>.formatParameter() = joinToString(prefix = "[", postfix = "]")
}