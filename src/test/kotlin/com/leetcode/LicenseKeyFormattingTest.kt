package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

internal class LicenseKeyFormattingTest :
    MultipleParametersAlgorithmTest<LicenseKeyFormatting>(LicenseKeyFormatting::class) {

    override fun inputValues() =
        listOf(
            arrayOf("5F3Z-2e-9-w", 4) to "5F3Z-2E9W",
            arrayOf("2-5g-3-J", 2) to "2-5G-3J"
        )
}