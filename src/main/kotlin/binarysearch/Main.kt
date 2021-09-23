package binarysearch

import heapdatastructure.ComparableConcreteHeap

fun main() {
    val array = arrayListOf(1,5,15,17,19,22,24,31,105)

    val search5 = array.indexOf(5)
    val binarySearch5 = array.binarySearch(5)

    println("indexOf(): $search5")
    println("binarySearch(): $binarySearch5")

    // This is how tto create a max heap
    val array1 = arrayListOf(1, 12, 3, 4, 1, 6, 8, 7)
    val maxHeap = ComparableConcreteHeap.create(array1)
    while (!maxHeap.isEmpty) {
        println(maxHeap.remove())
    }

    // This is how to create a min heap
    val array2 = arrayListOf(1, 12, 3, 4, 1, 6, 8, 7)
    val minHeap = ComparableConcreteHeap.create(array2)
    while (!minHeap.isEmpty) {
        println(minHeap.remove())
    }

}