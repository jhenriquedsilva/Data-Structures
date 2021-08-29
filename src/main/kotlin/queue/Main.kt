package queue

fun main() {
    /*
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
    */

    println("Queue with Ring Buffer")
    val queue2 = RingBufferQueue<String>(4)
    queue2.enqueue("Ray")
    queue2.enqueue("Brian")
    queue2.enqueue("Eric")
    queue2.enqueue("José")
    queue2.dequeue()
    queue2.jumpTheLine("Fernando")

    println(queue2)
}