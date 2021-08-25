package stack

fun String.checkParentheses(): Boolean {
    val stack = ConcreteStack<Char>()

    for (character in this) {
        when (character) {
            '(' -> stack.push(character)
            ')' -> if (stack.isEmpty) {
                return false
            }
        }
    }
}