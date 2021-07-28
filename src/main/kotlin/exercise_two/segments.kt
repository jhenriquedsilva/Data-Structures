package exercise_two

// Question 2
fun main() {
    println(segment("at","I'm great at football"))
    println(countOcurrences("a", "I'm great at football"))
}

// Verifies if segment(s) is within text(t)
fun segment(segment: String, text: String): Boolean {

    // Slice will have the same size as segment to check if slice is equal to segment in one of the iterations inside text
    var slice = ""
    val lastIndexOfText = text.lastIndex
    var start = 0
    var end = segment.lastIndex

    // Iteration has to stop at the end of text
    while (end <= lastIndexOfText) {
        // Slice is updated in each iteration with the value of new part of text
        slice = text.slice(start..end)
        if (slice == segment) {
            return true
        } else {
            // Start and end are updated
            start++
            end++
        }
    }
    return false
}

// Check how many times segment(s) is within text(t)
fun countOcurrences(segment: String, text: String): Int {
    // Slice will have the same size as segment to check if slice is equal to segment in one of the iterations inside text
    var slice = ""
    val lastIndexOfText = text.lastIndex
    var start = 0
    var end = segment.lastIndex
    var counter = 0 // Initially counter equals 0

    // Iteration has to stop at the end of text
    while (end <= lastIndexOfText) {
        // Slice is updated in each iteration with the value of new part of text
        slice = text.slice(start..end)
        if (slice == segment) {
            counter ++ // Counter is updated
            start++
            end++
        } else {
            start++ // Start and end are updated
            end++
        }
    }
    return counter
}
