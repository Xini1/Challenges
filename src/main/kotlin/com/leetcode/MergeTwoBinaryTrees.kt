package com.leetcode

import com.leetcode.generic.TreeNode

/**
 * @author Maxim Tereshchenko
 */
class MergeTwoBinaryTrees {

    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null) {
            return root2
        }

        root1.`val` += root2?.`val` ?: 0
        root1.left = mergeTrees(root1.left, root2?.left)
        root1.right = mergeTrees(root1.right, root2?.right)

        return root1
    }
}