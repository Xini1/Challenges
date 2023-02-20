package com.leetcode

class SubrectangleQueries {

    fun execute(operations: Array<String>, inputs: Array<Any>): Array<Any?> {
        var rectangle: Rectangle? = null
        val outputs = arrayOfNulls<Any?>(inputs.size)
        operations.zip(inputs).forEachIndexed { index, (operation, input) ->
            when (operation) {
                "SubrectangleQueries" -> rectangle = Rectangle(input as Array<IntArray>)
                "getValue" -> {
                    input as IntArray
                    outputs[index] = rectangle?.getValue(input[0], input[1])
                }

                "updateSubrectangle" -> {
                    input as IntArray
                    rectangle?.updateSubrectangle(input[0], input[1], input[2], input[3], input[4])
                }
            }
        }
        return outputs
    }
}

class Rectangle(private val rectangle: Array<IntArray>) {

    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        for (row in row1..row2) {
            for (column in col1..col2) {
                rectangle[row][column] = newValue
            }
        }
    }

    fun getValue(row: Int, col: Int): Int {
        return rectangle[row][col]
    }
}