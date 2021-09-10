package tree

import queue.Queue


typealias Visitor<T> = (TreeNode<T>) -> Unit

class TreeNode<T>(val value: T) {
    private val children: MutableList<TreeNode<T>> = mutableListOf()

    fun add(child: TreeNode<T>) = children.add(child)

    fun forEachDepthFirst(visit: Visitor<T>) {
        visit(this)
        children.forEach{
            it.forEachDepthFirst(visit)
        }
    }

    // I have to fix Queue for this method to run
    /*
    fun forEachLevelOrder(visit: Visitor<T>) {
        visit(this)
        val queue = Queue<TreeNode<T>>()
        children.forEach {queue.enqueue(it)}

        var node = queue.dequeue()
        while (node != null) {
            visit(node)
            node.children.forEach {queue.enqueue(it) }
            node = queue.dequeue()
        }

    }


    // Depends on the above one. So fix it
    fun serch(value: T): TreeNode<T>? {
        var result: TreeNode<T>? = null

        forEachLevelOrder {
            if (it.value == value) {
                result = it
            }
        }
        return result
    }
    */
}