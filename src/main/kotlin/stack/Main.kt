package stack

fun main() {
    println("using stack")
    var stack = ConcreteStack<Int>().apply {
        push(5)
        push(6)
        push(3)
        push(45)
    }
    println(stack)
    println("Popped: ${stack.pop()}")
    println(stack)

    println("\n\ninitializing a stack from a list")
    val list = listOf("A","B","C","D","E")
    val newStack = ConcreteStack.create(list)
    println(newStack)

    println("\n\ninitializing a stack from an array literal")
    val stack3 = stackOf(1.8,4.5,8.9,2.0)
    println(stack3)
    println("Popped: ${stack3.pop()}")

}