package com.leetcode

import com.leetcode.generic.TreeNode

/**
 * @author Maxim Tereshchenko
 */
class SerializeAndDeserializeBinaryTree {

    fun testThis(root: TreeNode?) = deserialize(serialize(root))

    private fun serialize(root: TreeNode?): String {
        val queue = mutableListOf(root)
        val resultList = mutableListOf<Int?>()

        while (!queue.all { it == null }) {
            val node = queue.removeFirstOrNull()
            resultList += node?.`val`

            if (node != null) {
                queue += node.left
                queue += node.right
            }
        }

        return resultList.joinToString(",") { it?.toString() ?: "" }
    }

    private fun deserialize(data: String): TreeNode? {
        val array = data.split(',')
            .map { if (it.isEmpty()) null else it.toInt() }

        if (array.isEmpty() || array[0] == null) {
            return null
        }

        val root = array[0]!!.run { TreeNode(this) }
        val stack = mutableListOf<TreeNode>().apply { add(root) }

        for (i in 1..array.size step 2) {
            stack.first().left = array.elementAtOrNull(i)?.run { TreeNode(this) }
            stack.first().right = array.elementAtOrNull(i + 1)?.run { TreeNode(this) }
            stack.removeFirst()
                .apply {
                    left?.run { stack.add(this) }
                }
                .apply {
                    right?.run { stack.add(this) }
                }
        }

        return root
    }
}