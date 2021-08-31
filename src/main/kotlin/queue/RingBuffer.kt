package queue

class RingBuffer<T> (private val size: Int) {

    private var array = ArrayList<T?>(size)
    // private var array = Array<T>(size)
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
        get() = (size - howManyElementsInTheQueue)

    // val isFull: Boolean
        // get() = (availableSpaceForWriting == 0)
        
    val isFull: Boolean
        get() = (availableSpace == 0)

    fun write(element: T): Boolean {
        if (!isFull) {
            if (array.size < size) {
                array.add(element)
            } else {
                array[writeIndex % size] = element
            }
            writeIndex += 1
            return true
        } else {
            return false
        }
    }

    fun jump(element: T): Boolean {
        if (isEmpty) {
            array.add(element)
            writeIndex++
            return true
        } else if (!isFull) {
            if (array.size < size) {
                var newElement = element
                var temporaryIndex = readIndex
                var elementToBeShifted: T

                while(temporaryIndex < writeIndex) {
                    elementToBeShifted = array[temporaryIndex]!!
                    array[temporaryIndex] = newElement
                    newElement = elementToBeShifted
                    temporaryIndex++
                }

                array.add(newElement)
                writeIndex++
                return true
            } else {
                var newElement = element
                var temporaryIndex = (readIndex % size)
                var elementToBeShifted: T

                while(temporaryIndex < writeIndex % size || temporaryIndex <= (writeIndex - 1) % size ) {
                    elementToBeShifted = array[temporaryIndex]!!
                    array[temporaryIndex] = newElement
                    newElement = elementToBeShifted
                    temporaryIndex++
                }

                array[temporaryIndex % size] = newElement
                writeIndex++
                return true
            }
        } else {
            return false
        }
    }


    fun read(): T? {
        if (!isEmpty) {
            val element = array[readIndex % size]
            readIndex += 1
            return element
        } else {
            return null
        }
    }

    // I modified the  variable name over here
    override fun toString(): String {
        return array.joinToString()
    }
        /*
        val values = (0 until howManyElementsInTheQueue).map { offset ->
            "${array[(readIndex + offset) % size]!!}"
        }
        return values.joinToString(prefix = "[", separator = ", ", postfix = "]")
    }
        */
}
