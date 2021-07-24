package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
internal class SqrtXTest : BaseTest<SqrtX>() {
    override fun classUnderTest() = SqrtX::class

    override fun input() =
        listOf(
            arrayOf(4) to 2,
            arrayOf(8) to 2,
            arrayOf(0) to 0,
            arrayOf(2147395600) to 46340
        )
}