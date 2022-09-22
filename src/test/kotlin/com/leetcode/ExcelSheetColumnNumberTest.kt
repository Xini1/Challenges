package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class ExcelSheetColumnNumberTest :
    SingleParameterAlgorithmTest<ExcelSheetColumnNumber>(ExcelSheetColumnNumber::class) {

    override fun inputValues() =
        listOf(
            "A" to 1,
            "AB" to 28,
            "ZY" to 701,
            "FXSHRXW" to 2147483647
        )
}