package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class ReshapeTheMatrix {

    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat.size * mat[0].size != r * c) {
            return mat
        }

        val flattened = mat.asSequence()
            .flatMap { it.asSequence() }
            .toList()

        return (flattened.indices step c)
            .asSequence()
            .map { flattened.subList(it, it + c) }
            .map { it.toIntArray() }
            .toList()
            .toTypedArray()
    }
}