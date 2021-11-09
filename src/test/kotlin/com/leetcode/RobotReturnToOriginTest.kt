package com.leetcode

import com.leetcode.test.SingleParameterAlgorithmTest

/**
 * @author Maxim Tereshchenko
 */
internal class RobotReturnToOriginTest : SingleParameterAlgorithmTest<RobotReturnToOrigin>(RobotReturnToOrigin::class) {

    override fun inputValues() =
        listOf(
            "UD" to true,
            "LL" to false,
            "RRDD" to false,
            "LDRRLRUULR" to false
        )
}