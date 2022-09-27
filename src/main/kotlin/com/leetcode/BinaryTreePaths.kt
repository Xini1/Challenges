package com.leetcode

import com.leetcode.generic.TreeNode

class BinaryTreePaths {

    fun binaryTreePaths(root: TreeNode?): List<String> {
        if (root == null) {
            return emptyList()
        }
        return paths(Path(), root).map { it.toString() }
    }

    private fun paths(path: Path, treeNode: TreeNode?): List<Path> {
        if (treeNode == null) {
            return emptyList()
        }
        val updated = path.append(treeNode.`val`)
        if (treeNode.left == null && treeNode.right == null) {
            return listOf(updated)
        }
        return paths(updated, treeNode.left) + paths(updated, treeNode.right)
    }

    private class Path(private val values: List<Int>) {

        constructor() : this(emptyList())

        fun append(value: Int) = Path(values + value)

        override fun toString(): String {
            return values.joinToString("->")
        }
    }
}