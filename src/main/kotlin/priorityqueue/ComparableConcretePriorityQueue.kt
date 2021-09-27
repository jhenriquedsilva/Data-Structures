package priorityqueue

import heapdatastructure.ComparableConcreteHeap
import heapdatastructure.Heap

class ComparableConcretePriorityQueue<T: Comparable<T>>: AbstractPriorityQueue<T>() {
    override val heap = ComparableConcreteHeap<T>()
}