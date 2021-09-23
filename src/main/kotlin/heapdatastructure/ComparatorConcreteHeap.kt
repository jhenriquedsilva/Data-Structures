package heapdatastructure

class ComparatorConcreteHeap<Element>(private val comparator: Comparator<Element>): AbstractHeap<Element>() {

    companion object {
        fun <Element: Comparable<Element>> create(elements: ArrayList<Element>, comparator: Comparator<Element>): Heap<Element> {
            val heap = ComparatorConcreteHeap<Element>(comparator)
            heap.heapify(elements)
            return heap
        }
    }
    override fun compare(a: Element, b: Element): Int {
        return comparator.compare(a,b)
    }
}