package com.leetcode

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

/**
 * @author Maxim Tereshchenko
 */
internal class SearchInsertPositionTest {

    @TestFactory
    fun tests() = listOf(
        Arguments(intArrayOf(1, 3, 5, 6), 5) to 2,
        Arguments(intArrayOf(1, 3, 5, 6), 2) to 1,
        Arguments(intArrayOf(1, 3, 5, 6), 7) to 4,
        Arguments(intArrayOf(1, 3, 5, 6), 0) to 0,
        Arguments(intArrayOf(1), 0) to 0,
    )
        .map { (args, expected) ->
            DynamicTest.dynamicTest("given $args return $expected") {
                Assertions.assertThat(SearchInsertPosition().searchInsert(args.nums, args.target)).isEqualTo(expected)
            }
        }

    data class Arguments(val nums: IntArray, val target: Int) {
    }
}