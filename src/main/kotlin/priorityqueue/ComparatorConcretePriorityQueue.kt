package priorityqueue

import heapdatastructure.ComparatorConcreteHeap
import heapdatastructure.Heap

class ComparatorConcretePriorityQueue<T>(private val comparator: Comparator<T>): AbstractPriorityQueue<T>() {
    override val heap: Heap<T>
        get() = ComparatorConcreteHeap(comparator)
}