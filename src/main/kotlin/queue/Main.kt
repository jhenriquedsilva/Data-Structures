package queue

fun main() {

    println("Queue with Ring Buffer")

    val queue = RingBufferQueue<String>(4)
    queue.enqueue("Ray") // Ray is the first element
    queue.enqueue("Brian") // Brian is the last one
    queue.jump("Eric") // Eric is the new first one
    queue.jump("Fernando") // Fernando is the new first one
    println(queue)
    // The queue is full
    // Can't add a new element. If I try to add a new one, the queue does not change
    println(queue.enqueue("Alex")) // Show return false as the queue is full
    queue.dequeue() // Eric is the first one right now and Brian is the last one
    queue.dequeue() // Ray is the first one right one and Brian is the last one
    println(queue)

    queue.jump("Caio") // Caio is the first one right now
    println(queue)
    queue.enqueue("José") // José is the lst one right now
    println(queue)

    println(queue.dequeue()) // Should print Caio
    println(queue.dequeue()) // Should print Ray
    println(queue.dequeue()) // Should print Brain
    println(queue.dequeue()) // Should print José
    println(queue.dequeue()) // Shuld return null because the queue is empty

    /*
     * Output
     * Queue with Ring Buffer
     * Fernando, Eric, Ray, Brian
     * false
     * Fernando, Eric, Ray, Brian
     * Brian, Eric, Caio, Ray
     * Brian, José, Caio, Ray
     * Caio
     * Ray
     * Brian
     * José
     * null
     */

}