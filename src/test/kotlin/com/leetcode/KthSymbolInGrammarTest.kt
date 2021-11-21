package com.leetcode

import com.leetcode.test.MultipleParametersAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class KthSymbolInGrammarTest : MultipleParametersAlgorithmTest<KthSymbolInGrammar>(KthSymbolInGrammar::class) {

    override fun inputValues() =
        listOf(
            arrayOf(1, 1) to 0,
            arrayOf(2, 1) to 0,
            arrayOf(2, 2) to 1,
            arrayOf(3, 1) to 0,
            arrayOf(30, 434991989) to 0,
            arrayOf(3, 3) to 1,
            arrayOf(4, 5) to 1
        )
}