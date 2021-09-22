package heapdatastructure

import kotlin.coroutines.CoroutineContext

class ComparableConcreteHeap<Element: Comparable<Comparable<Element>>>: AbstractHeap<Element>() {
    override fun compare(a: Element, b: Element): Int {
        return a.compareTo(b)
    }

    override val counter: Int
        get() = TODO("Not yet implemented")

    override fun insert(element: Element) {
        TODO("Not yet implemented")
    }

    override fun remove(): Element? {
        TODO("Not yet implemented")
    }

    override fun remove(index: Int): Element? {
        TODO("Not yet implemented")
    }

    override fun peek(): Element? {
        TODO("Not yet implemented")
    }
}