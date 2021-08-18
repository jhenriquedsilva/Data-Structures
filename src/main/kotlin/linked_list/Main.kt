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

     println("removing elements")
     list.add(23)
     list.add(234)
     list.add(78)
     println(list)
     list.remove(78)
     println(list)

     println("retaining elements")
     list.retainAll(listOf(23,234))
     println(list)

     println("remove all elements")
     list.add(23)
     list.add(234)
     list.add(78)
     println(list)
     list.removeAll(listOf(234, 23))
     println(list)



     println("Print in reverse")
     println(list)
     list.printInReverse()



     println("print middle")
     list.add(45)
     println(list)
     println(list.getMiddle()?.value)


     println("reverse list")
     println(list.reversed())


     println("merge lists")
     val list1 = LinkedList<Int>()
     list.add(1)
     list.add(2)
     list.add(3)
     list.add(4)
     list.add(5)

     val list2 = LinkedList<Int>()
     list2.add(-1)
     list2.add(0)
     list2.add(2)
     list2.add(2)
     list2.add(7)

     // There is a problem here because the lists are not sorted
     println("Left: $list")
     println("Right: $list2")
     println("Merged: ${list.mergeSorted(list2)}")
}