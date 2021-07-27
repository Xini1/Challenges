package com.leetcode

import com.leetcode.generic.TreeNode
import java.lang.Integer.min

/**
 * @author Maxim Tereshchenko
 */
class MinimumDepthOfBinaryTree {

    fun minDepth(root: TreeNode?): Int {
        return closestLeafDepth(root, 0)
    }

    private fun closestLeafDepth(node: TreeNode?, defaultValue: Int = Int.MAX_VALUE): Int {
        if (node == null) {
            return defaultValue
        }

        if (node.left == null && node.right == null) {
            return 1
        }

        return min(closestLeafDepth(node.left), closestLeafDepth(node.right)) + 1
    }
}