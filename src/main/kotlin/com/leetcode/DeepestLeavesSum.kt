package com.leetcode

import com.leetcode.generic.TreeNode

class DeepestLeavesSum {

    fun deepestLeavesSum(root: TreeNode?): Int {
        val leaves = leaves(root, 1)
        val maxLevel = leaves.asSequence()
            .map { it.first }
            .max()
        return leaves.asSequence()
            .filter { it.first == maxLevel }
            .map { it.second }
            .sum()
    }

    private fun leaves(node: TreeNode?, level: Int): Collection<Pair<Int, Int>> {
        if (node == null) {
            return emptyList()
        }
        if (node.left == null && node.right == null) {
            return listOf(level to node.`val`)
        }
        return leaves(node.left, level + 1) + leaves(node.right, level + 1)
    }
}