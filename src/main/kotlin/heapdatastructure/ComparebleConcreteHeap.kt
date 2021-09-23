package heapdatastructure

import kotlin.coroutines.CoroutineContext

class ComparableConcreteHeap<Element: Comparable<Element>>: AbstractHeap<Element>() {

    companion object {
        fun <Element: Comparable<Element>> create(elements: ArrayList<Element>): Heap<Element> {
            val heap = ComparableConcreteHeap<Element>()
            heap.heapify(elements)
            return heap
        }
    }
    override fun compare(a: Element, b: Element): Int {
        return a.compareTo(b)
    }
}