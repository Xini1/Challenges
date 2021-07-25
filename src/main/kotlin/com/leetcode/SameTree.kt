package com.leetcode

import com.leetcode.generic.TreeNode

/**
 * @author Maxim Tereshchenko
 */
class SameTree {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        }

        if (p?.`val` == q?.`val`) {
            return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
        }

        return false
    }
}