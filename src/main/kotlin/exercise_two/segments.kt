package exercise_two

// Question 2
fun main() {
    println(segment("at","I'm great at football")) // true
    println(segment("ta","I'm great at football")) // flase
    println(countOcurrences("a", "I'm great at football")) // 3
    println(countOcurrences("h", "I'm great at football")) // 0
}

// Verifies if segment is within text
fun segment(segment: String, text: String): Boolean {

    var slice = "" // This mutable variable will be updated with substrings from text to check if it is equal to segment when iterationg over text
    val lastIndexOfText = text.lastIndex // This immutable variable prevents an Out of Bound Exception
    // By these two mutable variables, the algorithm selects a different substring in each iteration
    var start = 0
    var end = segment.lastIndex

    // Iteration has to stop at the end of text
    while (end <= lastIndexOfText) {
        // Slice is updated with a new substring in each iteration
        slice = text.slice(start..end) // This is a range
        if (slice == segment) {
            return true
        } else {
            // "Start" and "end" are updated to get a new substring next iteration
            start++
            end++
        }
    }
    return false
}

// Check how many times segment(s) is within text(t)
fun countOcurrences(segment: String, text: String): Int {

    var slice = "" // This mutable variable will be updated with substrings from text to check if it is equal to segment when iterationg over text
    val lastIndexOfText = text.lastIndex // This immutable variable prevents an Out of Bound Exception
    // By these two mutable variables, the algorithm selects a different substring in each iteration
    var start = 0
    var end = segment.lastIndex
    var counter = 0 // Counts how many times segment is within text

    // Iteration has to stop at the end of text
    while (end <= lastIndexOfText) {
        // Slice is updated with a new substring in each iteration
        slice = text.slice(start..end) // This is a range
        if (slice == segment) {
            counter ++ // Counter is incremented
            // "Start" and "end" are updated to get a new substring next iteration
            start++
            end++
        } else {
            // "Start" and "end" are updated to get a new substring next iteration
            start++
            end++
        }
    }
    return counter
}
