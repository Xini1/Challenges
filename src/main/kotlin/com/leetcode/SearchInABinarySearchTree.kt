package com.leetcode

import com.leetcode.generic.TreeNode

/**
 * @author Maxim Tereshchenko
 */
class SearchInABinarySearchTree {

    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) {
            return null
        }

        if (root.`val` == `val`) {
            return root
        }

        return if (root.`val` > `val`) {
            searchBST(root.left, `val`)
        } else {
            searchBST(root.right, `val`)
        }
    }
}