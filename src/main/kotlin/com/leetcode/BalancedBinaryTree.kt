package com.leetcode

import com.leetcode.generic.TreeNode
import kotlin.math.abs
import kotlin.math.max

/**
 * @author Maxim Tereshchenko
 */
class BalancedBinaryTree {

    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }

        return abs(root.left.depth() - root.right.depth()) < 2 &&
                isBalanced(root.left) &&
                isBalanced(root.right)
    }

    private fun TreeNode?.depth(current: Int = 1): Int {
        if (this == null) {
            return current
        }

        return max(left.depth(current + 1), right.depth(current + 1))
    }
}