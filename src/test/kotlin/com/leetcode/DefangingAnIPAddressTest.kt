package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class DefangingAnIPAddressTest :
    SingleParameterAlgorithmTest<DefangingAnIPAddress>(DefangingAnIPAddress::class) {

    override fun inputValues() =
        listOf(
            "1.1.1.1" to "1[.]1[.]1[.]1",
            "255.100.50.0" to "255[.]100[.]50[.]0",
        )
}