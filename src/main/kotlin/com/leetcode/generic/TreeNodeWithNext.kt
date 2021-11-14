package com.leetcode.generic

/**
 * @author Maxim Tereshchenko
 */
class TreeNodeWithNext(
    var `val`: Int,
    var left: TreeNodeWithNext? = null,
    var right: TreeNodeWithNext? = null,
    var next: TreeNodeWithNext? = null
) {

    companion object {

        fun from(treeNode: TreeNode?): TreeNodeWithNext? {
            if (treeNode == null) {
                return null
            }

            return TreeNodeWithNext(
                treeNode.`val`,
                from(treeNode.left),
                from(treeNode.right)
            )
        }
    }

    fun pickNext(array: Array<Int?>) {
        array.asSequence()
            .zipWithNext()
            .filter { it.first != null }
            .forEach { findByValue(it.first!!)?.next = it.second?.run { findByValue(this) } }
    }

    private fun findByValue(value: Int): TreeNodeWithNext? {
        if (`val` == value) {
            return this
        }

        return left?.findByValue(value) ?: right?.findByValue(value)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TreeNodeWithNext

        if (`val` != other.`val`) return false
        if (left != other.left) return false
        if (right != other.right) return false
        if (next != other.next) return false

        return true
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (left?.hashCode() ?: 0)
        result = 31 * result + (right?.hashCode() ?: 0)
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        if (left == null && right == null && next == null) {
            return `val`.toString()
        }

        return "$`val` ($left, $right, ${next?.`val`})"
    }
}