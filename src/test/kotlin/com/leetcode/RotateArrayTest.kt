package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * @author Maxim Tereshchenko
 */
internal class RotateArrayTest {

    private val rotateArray = RotateArray()

    @Test
    fun `when (1,2,3,4,5,6,7), 3 then (5,6,7,1,2,3,4)`() {
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        rotateArray.rotate(array, 3)

        assertThat(array).isEqualTo(intArrayOf(5, 6, 7, 1, 2, 3, 4))
    }

    @Test
    fun `when (-1,-100,3,99), 2 then (3,99,-1,-100)`() {
        val array = intArrayOf(-1, -100, 3, 99)
        rotateArray.rotate(array, 2)

        assertThat(array).isEqualTo(intArrayOf(3, 99, -1, -100))
    }
}