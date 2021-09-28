package priorityqueue

fun main() {
    println("Example of max priority queue")
    val priorityQueue1 = ComparableConcretePriorityQueue<Int>()
    arrayListOf(1, 12, 3, 4, 1, 6, 8, 7).forEach { number -> priorityQueue1.enqueue(number) }
    while (!priorityQueue1.isEmpty) {
        println(priorityQueue1.dequeue())
    }

    println("\nExample of a min priority queue")
    val stringLengthComparator = object : Comparator<String> {
        override fun compare(o1: String?, o2: String?): Int {
            val length1 = o1?.length ?: -1
            val length2 = o2?.length ?: -1
            return length1 - length2
        }
    }
    val priorityQueue2 = ComparatorConcretePriorityQueue(stringLengthComparator)
    arrayListOf("one", "two", "three", "forty", "five", "six",
        "seven", "eight", "nine").forEach { priorityQueue2.enqueue(it) }
    while (!priorityQueue2.isEmpty) {
        println(priorityQueue2.dequeue())
    }
}

