package com.leetcode

import com.leetcode.test.AlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class ExcelSheetColumnTitleTest : AlgorithmTest<ExcelSheetColumnTitle>(ExcelSheetColumnTitle::class) {

    override fun parameters() =
        listOf(
            1 to "A",
            2 to "B",
            3 to "C",
            26 to "Z",
            27 to "AA",
            28 to "AB",
            701 to "ZY",
            2147483647 to "FXSHRXW",
        )
            .map { arrayOf(it.first) to it.second }
}