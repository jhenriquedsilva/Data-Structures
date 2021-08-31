package queue

// José Henrique da Silva e Caio André Barros Gonçalves

interface Queue<T> {
    fun enqueue(element: T): Boolean

    fun dequeue(): T?

    val count: Int
      get
    val isEmpty: Boolean
      get() = count == 0

    fun peek(): T?
}