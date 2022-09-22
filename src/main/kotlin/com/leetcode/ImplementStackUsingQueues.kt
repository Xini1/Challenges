package com.leetcode

import java.util.*

class ImplementStackUsingQueues {

    fun execute(operations: Array<String>, inputs: Array<Int?>): Array<Any?> {
        var myStack: MyStack? = null
        val outputs = arrayOfNulls<Any?>(inputs.size)
        operations.zip(inputs).forEachIndexed { index, (operation, input) ->
            when (operation) {
                "MyStack" -> myStack = MyStack()
                "push" -> myStack!!.push(input!!)
                "pop" -> outputs[index] = myStack!!.pop()
                "top" -> outputs[index] = myStack!!.top()
                "empty" -> outputs[index] = myStack!!.empty()
            }
        }
        return outputs
    }
}

class MyStack {

    private val queue: Deque<Int> = LinkedList()

    fun push(x: Int) {
        queue.add(x)
    }

    fun pop(): Int {
        return queue.pollLast()
    }

    fun top(): Int {
        return queue.peekLast()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */