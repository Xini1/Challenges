package com.leetcode

class RangeSumQueryImmutable {

    fun execute(operations: Array<String>, inputs: Array<IntArray>): Array<Any?> {
        var numArray: NumArray? = null
        val outputs = arrayOfNulls<Any?>(inputs.size)
        operations.zip(inputs).forEachIndexed { index, (operation, input) ->
            when (operation) {
                "NumArray" -> numArray = NumArray(input)
                "sumRange" -> outputs[index] = numArray?.sumRange(input[0], input[1])
            }
        }
        return outputs
    }
}

class NumArray(private val nums: IntArray) {

    fun sumRange(left: Int, right: Int): Int {
        return nums.slice(left..right).sum()
    }

}