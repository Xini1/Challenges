package com.leetcode

import java.util.*

class ImplementQueueUsingStacks {

    fun execute(operations: Array<String>, inputs: Array<Int?>): Array<Any?> {
        var myQueue: MyQueue? = null
        val outputs = arrayOfNulls<Any?>(inputs.size)
        operations.zip(inputs).forEachIndexed { index, (operation, input) ->
            when (operation) {
                "MyQueue" -> myQueue = MyQueue()
                "push" -> myQueue!!.push(input!!)
                "pop" -> outputs[index] = myQueue!!.pop()
                "peek" -> outputs[index] = myQueue!!.peek()
                "empty" -> outputs[index] = myQueue!!.empty()
            }
        }
        return outputs
    }
}

class MyQueue {

    private val popStack: Deque<Int> = LinkedList()
    private val pushStack: Deque<Int> = LinkedList()

    fun push(x: Int) {
        while (popStack.isNotEmpty()) {
            pushStack.offerLast(popStack.pollLast())
        }
        pushStack.offerLast(x)
        while (pushStack.isNotEmpty()) {
            popStack.offerLast(pushStack.pollLast())
        }
    }

    fun pop(): Int {
        return popStack.pollLast()
    }

    fun peek(): Int {
        return popStack.peekLast()
    }

    fun empty(): Boolean {
        return popStack.isEmpty()
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */