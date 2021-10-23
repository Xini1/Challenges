package com.leetcode

import com.leetcode.generic.Node

/**
 * @author Maxim Tereshchenko
 */
class NaryTreePreorderTraversal {

    fun preorder(root: Node?): List<Int> {
        if (root == null) {
            return emptyList()
        }

        return listOf(root.`val`) +
                root.children
                    .asSequence()
                    .map(this::preorder)
                    .flatMap(List<Int>::asSequence)

    }
}