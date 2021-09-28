package simplesortingalgorithms

fun main() {
    println("Bubble sort")
    val firstList = arrayListOf(9, 4, 10, 3)
    println("Original: $firstList")
    firstList.bubbleSort(true)
    println("Bubble sorted: $firstList")

    println("\nSelection sort")
    val secondList = arrayListOf(9, 4, 10, 3)
    println("Original: $secondList")
    secondList.selectionSort(true)
    println("Selection sorted: $secondList")

    println("\nInsertion sort")
    val thirdList = arrayListOf(9, 4, 10, 3)
    println("Original: $thirdList")
    thirdList.insertionSort(true)
    println("Bubble sorted: $thirdList")
}
