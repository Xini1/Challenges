package com.leetcode

class SummaryRanges {

    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) {
            return emptyList()
        }
        return summaryRangesRecursive(withoutFirst(nums), SingleValueRange(nums[0]))
            .map { it.toString() }
    }

    private fun summaryRangesRecursive(nums: IntArray, current: Range): List<Range> {
        if (nums.isEmpty()) {
            return listOf(current)
        }
        val first = nums.first()
        if (current.canAppend(first)) {
            return summaryRangesRecursive(withoutFirst(nums), current.append(first))
        }
        return listOf(current) + summaryRangesRecursive(withoutFirst(nums), SingleValueRange(first))
    }

    private fun withoutFirst(nums: IntArray) = nums.sliceArray(1 until nums.size)
}

interface Range {

    fun canAppend(value: Int): Boolean
    fun append(value: Int): Range
}

class SingleValueRange(private val value: Int) : Range {

    override fun canAppend(value: Int) = value == this.value + 1

    override fun append(value: Int) = BoundedRange(this.value, value)

    override fun toString(): String {
        return value.toString()
    }
}

class BoundedRange(private val lowerBound: Int, private val upperBound: Int) : Range {

    override fun canAppend(value: Int) = value == upperBound + 1

    override fun append(value: Int) = BoundedRange(lowerBound, value)

    override fun toString(): String {
        return "$lowerBound->$upperBound"
    }
}