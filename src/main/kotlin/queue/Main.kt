package queue

fun main() {
    println("Queue with ArrayList")
    val queue1 = ArrayListQueue<String>()
    queue1.apply {
        enqueue("Jose")
        enqueue("Fernando")
        enqueue("Marcelo")
    }
    println(queue1)
    queue1.dequeue()
    println(queue1)
    println("Next up: ${queue1.peek()}")

    println("Queue with Ring Buffer")
    val queue2 = RingBufferQueue<String>(10)
    queue2.enqueue("Ray")
    queue2.enqueue("Brian")
    queue2.enqueue("Eric")

    println(queue2)
    queue2.dequeue()
    println(queue2)
    println("Next up: ${queue2.peek()}")

    println("Just testing")
    val de = ArrayList<Int>(9)
    println(de.size)
}