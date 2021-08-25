package stack

// Checking if a character is balanced within a String
fun String.checkParentheses(): Boolean {
    val stack = ConcreteStack<Char>()

    for (character in this) {
        when (character) {
            '(' -> stack.push(character)
            ')' -> if (stack.isEmpty) return false else stack.pop()
        }
    }
    return stack.isEmpty
}