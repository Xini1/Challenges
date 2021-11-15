package com.leetcode

import com.leetcode.generic.TreeNodeWithNext

/**
 * @author Maxim Tereshchenko
 */
class PopulatingNextRightPointersInEachNodeII {

    fun connect(root: TreeNodeWithNext?): TreeNodeWithNext? {
        if (root == null) {
            return null
        }

        val queue = mutableListOf(root)

        while (queue.isNotEmpty()) {
            val buffer = mutableListOf<TreeNodeWithNext>()

            while (queue.isNotEmpty()) {
                val node = queue.removeFirst()
                node.next = queue.firstOrNull()

                node.left?.run { buffer.add(this) }
                node.right?.run { buffer.add(this) }
            }

            queue.addAll(buffer)
        }

        return root
    }
}