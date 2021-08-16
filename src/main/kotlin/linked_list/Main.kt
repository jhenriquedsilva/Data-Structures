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

     /**
      * Code is crashing here, and I don't know why
      * Prints the linked list in reverse order
     fun <T> LinkedList<T>.printInReverse() {
          this.nodeAt(0)?.printInReverse()
     }


     fun <T> Node<T>.printInReverse() {
          this.next?.printInReverse()
          if (this.next != null) {
               print("->")
          }
          print(this.value.toString())
     }

     println("Print in reverse")
     println(list)
     list.printInReverse()
      */

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

     println("print middle")
     list.add(45)
     println(list)
     println(list.getMiddle()?.value)

     fun <T> LinkedList<T>.reversed(): LinkedList<T> {
          val result = LinkedList<T>()
          val head = this.nodeAt(0)
          if (head != null) {
               addInReverse(result, head)
          }
          return result
     }

     println("reverse list")
     println(list.reversed())

     // Merging two linked lists
     fun <T : Comparable<T>> LinkedList<T>.mergeSorted(otherList: LinkedList<T>): LinkedList<T> {
          if (this.isEmpty()) return otherList
          if (otherList.isEmpty()) return this

          val result = LinkedList<T>()

          var left = nodeAt(0)
          var right = otherList.nodeAt(0)

          while (left != null && right != null) {
               if (left.value < right.value) {
                    left = append(result,left)
               } else {
                    right = append(result, right)
               }
          }

          while (left != null) {
               left = append(result, left)
          }

          while (right != null) {
               right = append(result,right)
          }

          return result
     }

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