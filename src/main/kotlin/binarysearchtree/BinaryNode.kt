package binarysearchtree

// Caio André Barros Gonçalves, Jonathas dos Santos Andrade e José Henrique da Silva

typealias Visitor<T> = (T) -> Unit

class BinaryNode<T>(var value: T) {

    var leftChild: BinaryNode<T>? = null
    var rightChild: BinaryNode<T>? = null
    val min: BinaryNode<T>?
        get() = leftChild?.min ?: this

    // The two following functions just print the tree
    // in a beautiful format
    override fun toString() = diagram(this)

    private fun diagram(node: BinaryNode<T>?,
                        top: String = "",
                        root: String = "",
                        bottom: String = ""): String {
        return node?.let {
            if (node.leftChild == null && node.rightChild == null) {
                "$root${node.value}\n"
            } else {
                diagram(node.rightChild, "$top ", "$top┌──", "$top│") +
                        root + "${node.value}\n" + diagram(
                    node.leftChild,
                    "$bottom│ ", "$bottom└──", "$bottom "
                )
            }
        } ?: "${root}null\n"
    }

    fun traverseInOrder(visit: Visitor<T>) {
        // If the currrent node has a left child,
        // recursively visit this child first
        leftChild?.traverseInOrder(visit)
        // Then visit the node itself
        visit(value)
        // If the current node has a right child,
        // recursively visit this child
        rightChild?.traverseInOrder(visit)
    }

    fun traversePreOrder(visit: Visitor<T>) {
        visit(value)
        leftChild?.traversePreOrder(visit)
        rightChild?.traversePreOrder(visit)
    }

    fun traversePostOrder(visit: Visitor<T>) {
        leftChild?.traversePostOrder(visit)
        rightChild?.traversePostOrder(visit)
        visit(value)
    }
}
