package com.leetcode.generic

/**
 * @author Maxim Tereshchenko
 */
class ListNode(var `val`: Int, var next: ListNode? = null) {

    companion object {
        fun of(array: IntArray) =
            array.asSequence()
                .map { ListNode(it) }
                .reduceOrNull { node, nextNode ->
                    node.also {
                        generateSequence(it) { seed -> seed.next }
                            .last()
                            .also { last -> last.next = nextNode }
                    }
                }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListNode

        if (`val` != other.`val`) return false
        if (next != other.next) return false

        return true
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return generateSequence(this) { node -> node.next }
            .map { it.`val` }
            .joinToString(prefix = "(", postfix = ")")
    }
}