package heapsort

fun main() {
    var array = arrayOf(6,12,2,26,8,18,21,9,5)
    array.heapSort(ascending)
    print(array.joinToString())
}