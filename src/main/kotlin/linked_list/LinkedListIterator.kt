package linked_list

class LinkedListIterator<T>(private val list: LinkedList<T>): Iterator<T>,MutableIterator<T> {

    private var index = 0
    private var lastNode: Node<T>? = null

    override fun hasNext(): Boolean {
        return index < list.size
    }

    override fun next(): T {
        if (index >= list.size) throw IndexOutOfBoundsException()

        lastNode = if (index == 0) list.nodeAt(0) else lastNode?.next
        index++
        return lastNode!!.value
    }

    // The index is always ahead
    override fun remove() {
        if (index == 1) {
            list.pop()
        } else {
            val previousNode = list.nodeAt(index - 2) ?: return
            list.removeAfter(previousNode)
            lastNode = previousNode
        }
        index--
    }

}