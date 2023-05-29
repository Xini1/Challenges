package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

internal class EncodeAndDecodeTinyURLTest :
    SingleParameterAlgorithmTest<EncodeAndDecodeTinyURL>(EncodeAndDecodeTinyURL::class) {

    override fun inputValues() =
        listOf(
            "https://leetcode.com/problems/design-tinyurl" to "https://leetcode.com/problems/design-tinyurl"
        )
}
