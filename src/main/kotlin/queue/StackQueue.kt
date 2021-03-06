package queue

import stack.ArrayListStack

class StackQueue<T>: Queue<T> {
    private val leftStack = ArrayListStack<T>()
    private val rightStack = ArrayListStack<T>()

    override val isEmpty: Boolean
        get() = leftStack.isEmpty && rightStack.isEmpty

    override fun enqueue(element: T): Boolean {
        rightStack.push(element)
        return true
    }

    override fun dequeue(): T? {
        if (leftStack.isEmpty) {
            transferElements()
        }
        return leftStack.pop()
    }

    override val count: Int
        get() = TODO("Not yet implemented")

    override fun peek(): T? {
        if (leftStack.isEmpty) {
            transferElements()
        }
        return leftStack.peek()
    }

    private fun transferElements() {
        var nextElement = rightStack.pop()
        while (nextElement != null) {
            leftStack.push(nextElement)
            nextElement = rightStack.pop()
        }
    }
}