package stack

fun main() {
    print("Enter the text to be reversed: ")
    val text = readLine()!! // Gets the input

    // Iterates over each word of the phrase
    for (word in text.split(" ")) {
        // A stack is created to reverse the word
        var stack: FixedArrayListStack<Char>? = FixedArrayListStack(word.length)
        // Each character is push into the stack
        for (char in word) {
            stack?.push(char.toUpperCase())
        }
        // The word is printed in reverse order
        print(stack)
        print(" ")
        stack = null // jus to free up this space in memory
    }
}