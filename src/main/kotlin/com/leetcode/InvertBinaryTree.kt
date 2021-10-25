package com.leetcode

import com.leetcode.generic.TreeNode

/**
 * @author Maxim Tereshchenko
 */
class InvertBinaryTree {

    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        val left = root.left
        root.left = root.right
        root.right = left

        invertTree(root.left)
        invertTree(root.right)

        return root
    }
}