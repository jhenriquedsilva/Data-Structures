package queue

class RingBufferQueue<T>(size: Int): Queue<T> {

    private val ringBuffer: RingBuffer<T> = RingBuffer(size)

    override fun enqueue(element: T): Boolean {
        return ringBuffer.write(element)
    }

    override fun dequeue(): T? {
        return if (isEmpty) null else ringBuffer.read()
    }

    override fun toString(): String {
        return ringBuffer.toString()
    }

    override val count: Int
        get() = ringBuffer.count
    override val isEmpty: Boolean
        get() = super.isEmpty

    override fun peek(): T? {
        return ringBuffer.first
    }
}