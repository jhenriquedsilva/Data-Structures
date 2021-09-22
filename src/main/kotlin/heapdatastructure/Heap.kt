package heapdatastructure

interface Heap<Element>: Collection<Element> {
    //Returns the min or the max depending on the implementation
    fun peek(): Element?
}