package com.leetcode

import com.leetcode.generic.TreeNode
import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class MergeTwoBinaryTreesTest :
    MultipleParametersAlgorithmTest<MergeTwoBinaryTrees>(MergeTwoBinaryTrees::class) {

    override fun inputValues() =
        listOf(
            arrayOf(arrayOf(1, 3, 2, 5), arrayOf(2, 1, 3, null, 4, null, 7)) to arrayOf(3, 4, 5, 5, 4, null, 7),
            arrayOf(arrayOf(1), arrayOf(1, 2)) to arrayOf(2, 2)
        )
            .map { arrayOf(TreeNode.from(it.first[0]), TreeNode.from(it.first[1])) to TreeNode.from(it.second) }
}