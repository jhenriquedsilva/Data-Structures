package priorityqueue

import heapdatastructure.Heap
import queue.Queue

abstract class AbstractPriorityQueue<T>: Queue<T> {
    abstract val heap: Heap<T>

    override fun enqueue(element: T): Boolean {
        heap.insert(element)
        return true
    }

    override fun dequeue(): T? {
        return heap.remove()
    }

    override val count: Int
        get() = heap.counter

    override fun peek(): T? {
        return heap.peek()
    }
}