package binarysearchtree

fun main() {
    // Elements are inserted
    val tree = BinarySearchTree<Int>().apply {
        for (number in listOf(86,11,7,35,170,2,120,21,88,152,31,12,181,28,134,70,1,85,25,77,10,128,198)) {
            insert(number)
        }
    }

    println(tree)

    // A leat node is removed
    tree.remove(88)

    println(tree)

    // A node with one child is removed
    tree.remove(181)

    println(tree)

    // A node with two children is removed
    tree.remove(11)

    println(tree)

    // Verifies if a value is within the tree
    println("\nDoes the three contain 35? ${tree.contains(35)}\n")

    // Traverses the tree in order
    tree.root?.traverseInOrder { print("$it ") }

    /*
    val zero = BinaryNode(0)
    val one = BinaryNode(1)
    val five = BinaryNode(5)
    val seven = BinaryNode(7)
    val eight = BinaryNode(8)
    val nine = BinaryNode(9)

    seven.leftChild = one
    one.leftChild = zero
    one.rightChild = five
    seven.rightChild = nine
    nine.leftChild = eight

    val tree = seven
    tree.traverseInOrder { println(it) }

    println()

    tree.traversePreOrder { println(it) }

    println()

    tree.traversePostOrder { println(it) }

    println()

    println("Creating a binary search tree")

    val exampleTree = BinarySearchTree<Int>().apply {
        insert(3)
        insert(1)
        insert(4)
        insert(0)
        insert(2)
        insert(5)
    }

    println(exampleTree)

    println("finding a node")

    if (exampleTree.contains(5)) {
        println("Found 5!")
    } else {
        println("Couldn't find 5")
    }

    println("Removing a node")
    println("Tree before removal")
    println(exampleTree)
    exampleTree.remove(3)
    println("Tree after removing root:")
    println(exampleTree)
    */
}