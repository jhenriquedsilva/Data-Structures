package linked_list

// Gets node at the middle
fun <T> LinkedList<T>.getMiddle(): Node<T>? {
    var slow = this.nodeAt(0)
    var fast = this.nodeAt(0)

    // Smart cast here, that is, it becomes a non-nullable type
    // This runner technique
    while (fast != null) {
        fast = fast.next
        if (fast != null) {
            fast = fast.next
            slow = slow?.next
        }
    }
    return slow
}