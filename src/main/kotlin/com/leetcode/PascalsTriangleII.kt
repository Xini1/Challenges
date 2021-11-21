package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class PascalsTriangleII {

    fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex == 0) {
            return listOf(1)
        }

        val previous = getRow(rowIndex - 1)

        return sequenceOf(
            sequenceOf(previous.first()),
            previous.asSequence()
                .zipWithNext()
                .map { it.first + it.second },
            sequenceOf(previous.last())
        )
            .flatten()
            .toList()
    }
}