package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class ReverseWordsInAStringIIITest :
    SingleParameterAlgorithmTest<ReverseWordsInAStringIII>(ReverseWordsInAStringIII::class) {

    override fun inputValues() =
        listOf(
            "Let's take LeetCode contest" to "s'teL ekat edoCteeL tsetnoc",
            "God Ding" to "doG gniD"
        )
}