package com.leetcode

import com.leetcode.generic.TreeNode

/**
 * @author Maxim Tereshchenko
 */
class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (inorder.isEmpty()) {
            return null
        }

        val headValue = preorder[0]
        val headValueIndex = inorder.indexOf(headValue)
        val inorderLeftSubTree = inorder.sliceArray(0 until headValueIndex)
        val inorderRightSubTree = inorder.sliceArray(headValueIndex + 1 until inorder.size)

        val head = TreeNode(headValue)
        head.left = buildTree(preorder.filterFrom(inorderRightSubTree + headValue), inorderLeftSubTree)
        head.right = buildTree(preorder.filterFrom(inorderLeftSubTree + headValue), inorderRightSubTree)

        return head
    }

    private fun IntArray.filterFrom(other: IntArray) =
        asSequence()
            .filter { it !in other }
            .toList()
            .toIntArray()
}