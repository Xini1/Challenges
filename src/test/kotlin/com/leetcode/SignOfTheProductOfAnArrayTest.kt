package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class SignOfTheProductOfAnArrayTest :
    AlgorithmTest<SignOfTheProductOfAnArray>(SignOfTheProductOfAnArray::class) {

    override fun parameters() =
        listOf(
            intArrayOf(-1, -2, -3, -4, 3, 2, 1) to 1,
            intArrayOf(1, 5, 0, 2, -3) to 0,
            intArrayOf(-1, 1, -1, 1, -1) to -1,
            intArrayOf(
                41,
                65,
                14,
                80,
                20,
                10,
                55,
                58,
                24,
                56,
                28,
                86,
                96,
                10,
                3,
                84,
                4,
                41,
                13,
                32,
                42,
                43,
                83,
                78,
                82,
                70,
                15,
                -41
            ) to -1
        )
            .map { arrayOf(it.first) to it.second }
}