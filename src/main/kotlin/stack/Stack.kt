package stack

interface Stack<Element> {
    val count: Int
      get

    val isEmpty: Boolean
      get() = count == 0

    // Essential
    fun push(element:Element)
    // Essential
    fun pop(): Element?

    fun peek(): Element?
}