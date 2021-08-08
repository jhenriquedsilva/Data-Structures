package linked_list

fun main() {
     println("creating and linking nodes")
     val node1 = Node(1)
     val node2 = Node(2)
     val node3 = Node(3)

     node1.next = node2
     node2.next = node3

     println(node1)

     println("push example")
     val list = LinkedList<Int>()
     list.push(3).push(4).push(5)

     println(list)
}