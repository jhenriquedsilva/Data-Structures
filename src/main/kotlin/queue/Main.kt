package queue

fun main() {
    println("Queue with ArrayList")
    val queue = ArrayListQueue<String>()
    queue.apply {
        enqueue("Jose")
        enqueue("Fernando")
        enqueue("Marcelo")
    }
    println(queue)
    queue.dequeue()
    println(queue)
    println("Next up: ${queue.peek()}")
}