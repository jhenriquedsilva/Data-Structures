package stack

// José Henrique da Silva e Caio André Barros Gonçalves

class FixedArrayListStack<T>(private val size: Int): Stack<T> {

    private val storage = ArrayList<T>(size)

    override val count: Int
        get() = storage.size

    override fun push(element: T) {
        if (count < size) {
            storage.add(element)
        }
    }

    override fun pop(): T? {
        if (isEmpty) {
            return null
        }
        return storage.removeAt(count - 1)
    }

    override fun peek(): T? {
        return storage.lastOrNull()
    }

    override fun toString() = buildString {
        storage.asReversed().forEach {
            append("$it")
        }
    }
}