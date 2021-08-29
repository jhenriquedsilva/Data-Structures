package stack

class ArrayListStack<T>(): Stack<T> {
    private val storage = arrayListOf<T>()
    override val count: Int
        get() = storage.size

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        /*
        if (storage.size == 0) {
            return null
        }
        return storage.removeAt(storage.size - 1)
        */
        if (isEmpty) {
            return null
        }
        return storage.removeAt(count - 1)
    }

    override fun toString() = buildString {
        appendln("----top----")
        storage.asReversed().forEach {
            appendln("$it")
        }
        appendln("-----------")
    }

    override fun peek(): T? {
        return storage.lastOrNull()
    }

    companion object {
        // Creates a stack if a list is given
        fun <T> create(items: Iterable<T>): Stack<T> {
            val stack = ArrayListStack<T>()
            for (item in items) {
                stack.push(item)
            }
            return stack
        }
    }
}