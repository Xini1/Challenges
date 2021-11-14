package com.leetcode

import com.leetcode.generic.TreeNodeWithNext


/**
 * @author Maxim Tereshchenko
 */
class PopulatingNextRightPointersInEachNode {

    fun connect(root: TreeNodeWithNext?): TreeNodeWithNext? {
        if (root == null) {
            return null
        }

        root.left?.next = root.right
        root.right?.next = root.next?.left

        connect(root.left)
        connect(root.right)

        return root
    }
}