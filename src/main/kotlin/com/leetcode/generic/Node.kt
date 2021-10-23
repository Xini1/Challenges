package com.leetcode.generic

/**
 * @author Maxim Tereshchenko
 */
class Node(val `val`: Int, var children: List<Node> = listOf()) {

    companion object {

        fun from(array: Array<Int?>): Node? {
            if (array.isEmpty() || array[0] == null) {
                return null
            }

            val stack = mutableListOf<Node>()
            var children = mutableListOf<Node>()

            val head = Node(array[0]!!)
            stack.add(head)

            for (value in array.sliceArray(2 until array.size)) {
                if (value == null) {
                    stack.removeFirst().children = children
                    children = mutableListOf()

                    continue
                }

                val node = Node(value)
                stack.add(node)
                children.add(node)
            }

            stack.removeFirst().children = children

            return head
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Node

        if (`val` != other.`val`) return false
        if (children != other.children) return false

        return true
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + children.hashCode()
        return result
    }

    override fun toString(): String {
        if (children.isEmpty()) {
            return `val`.toString()
        }

        return "$`val` $children"
    }
}