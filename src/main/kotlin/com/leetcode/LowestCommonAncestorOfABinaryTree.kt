package com.leetcode

import com.leetcode.generic.TreeNode

/**
 * @author Maxim Tereshchenko
 */
class LowestCommonAncestorOfABinaryTree {

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode {
        val map = mutableMapOf<TreeNode, TreeNode>()
        buildMapOfParent(root, map)

        val parents = mutableSetOf<TreeNode>()
        var currentP = p
        var currentQ = q

        while (true) {
            if (currentP != null && !parents.add(currentP)) {
                return currentP
            }

            if (currentQ != null && !parents.add(currentQ)) {
                return currentQ
            }

            currentP = map[currentP]
            currentQ = map[currentQ]
        }
    }

    private fun buildMapOfParent(root: TreeNode?, map: MutableMap<TreeNode, TreeNode>) {
        if (root == null) {
            return
        }

        root.left?.run { map[this] = root }
        root.right?.run { map[this] = root }

        buildMapOfParent(root.left, map)
        buildMapOfParent(root.right, map)
    }
}