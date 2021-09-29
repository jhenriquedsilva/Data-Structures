package mergesort

fun main() {
    println("\n Merge sort")
    val list = listOf(7, 2, 6, 3, 9)
    println("Original: $list")
    val result = list.mergeSort()
    println("Merge sorted: $result")
}