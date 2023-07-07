package com.leetcode

class ExecutionOfAllSuffixInstructionsStayingInGrid {

    fun executeInstructions(n: Int, startPos: IntArray, s: String): IntArray {
        val result = IntArray(s.length)
        for (index in s.indices) {
            var robot = Robot(n, RobotCoordinates(startPos[0], startPos[1]))
            var executed = 0
            for (instruction in s.substring(index)) {
                val afterExecution = robot.execute(instruction)
                if (afterExecution == null) {
                    break
                }
                executed++
                robot = afterExecution
            }
            result[index] = executed
        }
        return result
    }
}

class Robot(private val gridSize: Int, private val coordinates: RobotCoordinates) {

    fun execute(instruction: Char): Robot? {
        val destination = when (instruction) {
            'R' -> coordinates.right()
            'D' -> coordinates.down()
            'L' -> coordinates.left()
            'U' -> coordinates.up()
            else -> coordinates
        }
        return if (destination.isValid(gridSize)) {
            Robot(gridSize, destination)
        } else {
            null
        }
    }
}

class RobotCoordinates(private val x: Int, private val y: Int) {

    fun right() = RobotCoordinates(x, y + 1)
    fun left() = RobotCoordinates(x, y - 1)
    fun up() = RobotCoordinates(x - 1, y)
    fun down() = RobotCoordinates(x + 1, y)
    fun isValid(gridSize: Int) = (x in 0 until gridSize) && (y in 0 until gridSize)
}