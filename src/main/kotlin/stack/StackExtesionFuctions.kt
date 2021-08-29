package stack

fun <T> stackOf(vararg elements: T): Stack<T> {
    return ArrayListStack.create(elements.asList())
}