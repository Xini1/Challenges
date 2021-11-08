package com.leetcode

/**
 * @author Maxim Tereshchenko
 */
class RobotReturnToOrigin {

    fun judgeCircle(moves: String): Boolean {
        return moves.asSequence()
            .mapNotNull {
                when (it) {
                    'U' -> 0 to 1
                    'D' -> 0 to -1
                    'L' -> -1 to 0
                    'R' -> 1 to 0
                    else -> null
                }
            }
            .reduce { position, change -> position.first + change.first to position.second + change.second }
            .run {
                this == 0 to 0
            }
    }
}