package heapdatastructure

interface Collection<Element> {
    val counter: Int
        get

    val isEmpty: Boolean
        get() = counter == 0

    fun insert(element: Element)

    fun remove(): Element?

    fun remove(index: Int): Element?
}