package binarysearchtree

class BinarySearchTree<T: Comparable<T>>() {
    // Initially, the binary search tree is empty
    var root: BinaryNode<T>? = null

    // If root is is null, so the the tree is eampty
    override fun toString() = root?.toString() ?: "empty tree"

    // Inserted is implemented using these two following methods
    // This first one is public
    fun insert(value: T) {
        // Tha assignments are made recursively.
        // First with the root element, then with
        // each child node
        root = insert(root, value)
    }

    // This second one is private
    private fun insert(node: BinaryNode<T>?, value: T): BinaryNode<T> {
        // If current is null, return a new node
        node ?: return BinaryNode(value)

        // If the value to be inserted is less than the value of the current node,
        // insert in the left child. Otherwise, insert in the right child.
        if(value < node.value) {
            node.leftChild = insert(node.leftChild, value)
        } else {
            node.rightChild = insert(node.rightChild, value)
        }
        // Just return the current node to conform with the function return value.
        // It reassigns itself
        return node
    }

    fun remove(value: T) {
        root = remove(root, value)
    }

    private fun remove(node: BinaryNode<T>?, value: T): BinaryNode<T>? {
        node ?: return null

        when {
            // If value is found
            value == node.value -> {

                // If the node is a leaf, return null, removing the current node
                if (node.leftChild == null && node.rightChild == null) {
                   return null
                }

                // If the node has no left child, return the right subtree
                if (node.leftChild == null) {
                    return node.rightChild
                }

                // If the node has no right child, return the left subtree
                if (node.rightChild == null) {
                    return node.leftChild
                }

                // Node has a right and left child
                // So the node's value is replaced with
                // the smallest value from the right subtree
                node.rightChild?.min?.value?.let {
                    node.value = it
                }

                // Call remove on the right child to remove the swapped value
                node.rightChild = remove(node.rightChild, node.value)
            }

            // If the value to be removed is less than the value of the current node,
            // remove in the left child. Otherwise, remove in the right child.
            value < node.value -> {
                node.leftChild = remove(node.leftChild, value)
            }

            else -> node.rightChild = remove(node.rightChild,value)
        }

        // Just return the current node to conform with the function return value.
        // It reassigns itself
        return node
    }

    fun contains(value: T): Boolean {
        // Sets current to root node
        var current = root

        while (current != null) {
            // Checks is the current node value is equal to
            // value that tou are looking for
            if (current.value == value) {
                return true
            }
            // Change current node to left or right child
            current = if (value < current.value) {
                current.leftChild
            } else {
                current.rightChild
            }
        }

        // If there is no match, the value does not exist in the tree
        return false
    }

    // First version of contains
    /**
    fun contains(value: T): Boolean {
        root ?: return false

        var found = false
        root?.traverseInOrder {
            if (value == it) {
                found = true
            }
        }

        return true
    }
    */
}