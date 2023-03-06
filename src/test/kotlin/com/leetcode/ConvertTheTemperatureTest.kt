package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class ConvertTheTemperatureTest :
    SingleParameterAlgorithmTest<ConvertTheTemperature>(ConvertTheTemperature::class) {

    override fun inputValues() =
        listOf(
            36.5 to doubleArrayOf(309.65, 97.7),
            122.11 to doubleArrayOf(395.26, 251.798)
        )
}