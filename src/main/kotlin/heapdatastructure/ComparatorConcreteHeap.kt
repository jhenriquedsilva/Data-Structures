package heapdatastructure

class ComparatorConcreteHeap<Element>(
    private val comparator: Comparator<Element>
): AbstractHeap<Element>() {
    override fun compare(a: Element, b: Element): Int {
        return comparator.compare(a,b)
    }
}