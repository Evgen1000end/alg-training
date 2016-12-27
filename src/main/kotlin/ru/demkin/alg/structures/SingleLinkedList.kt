package ru.demkin.alg.structures

import java.util.*

/**
 * @author evgeny.demkin@moex.com
 */
class Node<T>(val value:T) {
  var next: Node<T>? = null

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is Node<*>) return false
    if (value != other.value) return false
    return true
  }

  override fun hashCode(): Int {
    return value?.hashCode() ?: 0
  }

  override fun toString(): String {
    return "Node(value=$value)"
  }
}

class SingleLinkedList <T> {
  var head: Node<T>? = null

  fun add(value: T) {
    if (head == null) {
      println("Added head node = $value")
      head = Node(value)
    } else {
      var tail = head
      while (tail?.next != null) {
        println("node ${tail?.value} is not last")
        tail = tail?.next
      }
      tail?.next = Node(value)
      println("Added last $value")
    }
  }

  fun get(index:Int):Node<T> {
    var tail = head ?: throw ArrayIndexOutOfBoundsException(index)
    var current = 0
    while (current != index) {
      tail = tail.next ?: throw ArrayIndexOutOfBoundsException(current)
      current++
    }
    return  tail
  }

  fun insertAfter(index: Int, value: T) {

  }
}


fun <T> reverseTraverseRecursive(value:SingleLinkedList<T>, order:ArrayList<String>) {
    reverseTraverseRecursive(value.head, order)
}

fun <T> reverseTraverseRecursive(value:Node<T>?, order:ArrayList<String>) {
  if (value == null) return
  reverseTraverseRecursive(value.next, order)
  order.add(value?.value.toString())
}

fun <T> reverseTraverseIterative(value:SingleLinkedList<T>, order:ArrayList<String>) {
  //reverseTraverseRecursive(value.head, order)
}
