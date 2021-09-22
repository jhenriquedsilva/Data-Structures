package binarysearch

fun main() {
    val array = arrayListOf(1,5,15,17,19,22,24,31,105)

    val search5 = array.indexOf(5)
    val binarySearch5 = array.binarySearch(5)

    println("indexxOf(): $search5")
    println("binarySearch(): $binarySearch5")
}