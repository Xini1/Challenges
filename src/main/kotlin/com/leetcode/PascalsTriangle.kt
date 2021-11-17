package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class PascalsTriangle {

    fun generate(numRows: Int): List<List<Int>> {
        if (numRows == 1) {
            return listOf(listOf(1))
        }

        val previous = generate(numRows - 1)
        val last = previous.last()

        return previous.toMutableList()
            .apply {
                add(
                    sequenceOf(
                        sequenceOf(last.first()),
                        last.asSequence()
                            .zipWithNext()
                            .map { it.first + it.second },
                        sequenceOf(last.last())
                    )
                        .flatten()
                        .toList()
                )
            }
    }
}