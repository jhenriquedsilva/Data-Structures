package linked_list


fun <T: Any> LinkedList<T>.printInReverse() {
    this.nodeAt(0)?.printInReverse()
}


fun <T: Any> Node<T>.printInReverse() {
    this.next?.printInReverse()
    if (this.next != null) {
        print("->")
    }
    print(this.value.toString())
}