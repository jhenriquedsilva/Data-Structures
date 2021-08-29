package stack

import linked_list.LinkedList

fun <T> LinkedList<T>.printInReverse() {
    val stack = ArrayListStack<T>()

    for(node in this) {
        stack.push(node)
    }

    var node = stack.pop()
    while (node != null) {
        print("$node ")
        node = stack.pop()
    }
}