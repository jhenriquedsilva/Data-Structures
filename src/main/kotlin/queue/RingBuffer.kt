package queue

class RingBuffer<T> (private val size: Int) {

    private var array = ArrayList<T?>(size)
    private var readIndex = 0
    private var writeIndex = 0

    val count: Int
        get() = howManyElementsInTheQueue

   // private val availableSpaceForReading: Int
        // get() = (writeIndex - readIndex)
    
    private val howManyElementsInTheQueue
        get() = (writeIndex - readIndex)

    val first: T?
        get() = array.getOrNull(readIndex)

    val isEmpty: Boolean
        get() = (count == 0)

    // private val availableSpaceForWriting: Int
        // get() = (size - availableSpaceForReading)
        
    private val availableSpace: Int
        // get() = (size - howManyElementsInTheQueue)

    // val isFull: Boolean
        // get() = (availableSpaceForWriting == 0)
        
    val isFull: Boolean
        get() = (availableSpace == 0)

    fun write(element: T): Boolean {
        return if (!isFull) {
            if (array.size < size) {
                array.add(element)
            } else {
                array[writeIndex % size] = element
            }
            writeIndex += 1
            true
        } else {
            false
        }
    }

    // Need a fix
    fun jumpTheLine(element: T): Boolean {
        if (!isFull) {
            if (array.size < size) {
                if (readIndex == 0) {
                    readIndex = size - 1
                    array.add(readIndex, element)
                } else {
                    readIndex -= 1
                    array.add(readIndex, element)
                }
            }
            return true
        } else {
            return false
        }
    }

    fun read(): T? {
        return if (!isEmpty) {
            val element = array[readIndex % size]
            readIndex += 1
            element
        } else {
            null
        }
    }

    // I modified the  variable name over here
    override fun toString(): String {
        val values = (0 until howManyItemsInTheQueue).map { offset ->
            "${array[(readIndex + offset) % size]!!}"
        }
        return values.joinToString(prefix = "[", separator = ", ", postfix = "]")
    }

}
