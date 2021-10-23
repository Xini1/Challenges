package com.leetcode

import com.leetcode.generic.TreeNode

/**
 * @author Maxim Tereshchenko
 */
class MinimumDistanceBetweenBSTNodes {

    fun minDiffInBST(root: TreeNode?): Int {
        return root.values()
            .sorted()
            .zipWithNext()
            .map { it.second - it.first }
            .minOrNull()!!
    }

    private fun TreeNode?.values(): Sequence<Int> {
        if (this == null) {
            return emptySequence()
        }

        return left.values() + right.values() + `val`
    }
}