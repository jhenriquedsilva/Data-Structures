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

     println("append example")
     list.append(32).append(43).append(100)
     println(list)

     println("inserting at a particular index")
     var node4 = list.nodeAt(3)!!
     for (i in 1..3) {
          node4 = list.insert(-1 * i, node4)
     }
     println(list)

     println("pop")
     println(list.pop())
     println(list)
     println(list.pop())
     println(list)

     println("removing the last node")
     println("Before removing last node")
     println(list)
     val removed = list.removeLast()
     println("After removal")
     println(list)

     println("Before removing at a particular index")
     println(list)
     val index = 2
     val node5 = list.nodeAt(index)!!
     list.removeAfter(node5)
     println("After removing at a particular index")
     println(list)

     for (item in list) {
          println("Double: $item")
     }
}