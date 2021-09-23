package heapdatastructure

import java.util.*
import kotlin.collections.ArrayList

abstract class AbstractHeap<Element>(): Heap<Element> {

    var elements: ArrayList<Element> = ArrayList<Element>()
    override val counter: Int
        get() = elements.size

    override fun peek(): Element? {
        return elements.first()
    }

    private fun leftChildIndex(index: Int): Int {
        return (2 * index) + 1
    }

    private fun rightChildIndex(index: Int): Int {
        return (2 * index) + 2
    }

    private fun parentIndex(index: Int): Int {
        return (index - 1) / 2
    }

    // Insert implementation
    override fun insert(element: Element) {
        elements.add(element)
        siftUp(counter - 1)
    }

    private fun siftUp(index: Int) {
        var child = index
        var parent = parentIndex(child)
        while (child > 0 && compare(elements[child],elements[parent]) > 0) {
            Collections.swap(elements,child,parent)
            child = parent
            parent = parentIndex(child)
        }
    }
    // End of inseert implementation

    // Remove implementation
    override fun remove(): Element? {
        if (isEmpty) return null

        Collections.swap(elements, 0,counter - 1)
        val item = elements.removeAt(counter - 1)
        siftDown(0)
        return item
    }

    private fun siftDown(index: Int) {
        var parent = index
        while (true) {
            val left = leftChildIndex(parent)
            val right = rightChildIndex(parent)
            var candidate = parent
            if (left < counter && compare(elements[left], elements[candidate]) > 0) {
                candidate = left
            }
            if (right < counter && compare(elements[right], elements[candidate]) > 0) {
                candidate = right
            }
            if (candidate == parent) {
                return
            }
            Collections.swap(elements,parent,candidate)
            parent = candidate
        }
    }

    override fun remove(index: Int): Element? {
        // Not within the bounds of the array
        if (index >= counter) return null

        return if (index == counter - 1) {
            elements.removeAt(counter - 1)
        } else {
            Collections.swap(elements,index,counter - 1)
            val item = elements.removeAt(counter - 1)
            siftDown(index)
            siftUp(index)
            item
        }
    }

    private fun index(element: Element, i: Int): Int? {
        if (i >= counter) {
            return null
        }
        if ((compare(element, elements[i]) > 0)) {
            return null
        }
        if (element == elements[i]) {
            return i
        }
        val leftChildIndex = index(element,leftChildIndex(i))
        if (leftChildIndex != null) return leftChildIndex

        val rightChildIndex = index(element,rightChildIndex(i))
        if (rightChildIndex != null) return rightChildIndex

        return null
    }

    protected fun heapify(values: ArrayList<Element>) {
        elements = values
        if (!elements.isEmpty()) {
            (counter / 2 downTo 0).forEach { index ->
                siftDown(index)
            }
        }
    }
    // End of remove immplementation
    abstract fun compare(a: Element, b: Element): Int
}