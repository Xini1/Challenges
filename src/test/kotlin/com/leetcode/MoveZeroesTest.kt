package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * @author Maxim Tereshchenko
 */
internal class MoveZeroesTest {

    private val moveZeroes = MoveZeroes()

    @Test
    fun `when (0,1,0,3,12) then (1,3,12,0,0)`() {
        val array = intArrayOf(0, 1, 0, 3, 12)

        moveZeroes.moveZeroes(array)

        assertThat(array).isEqualTo(intArrayOf(1, 3, 12, 0, 0))
    }

    @Test
    fun `when (0) then (0)`() {
        val array = intArrayOf(0)

        moveZeroes.moveZeroes(array)

        assertThat(array).isEqualTo(intArrayOf(0))
    }
}