package ru.demkin.alg.structures

import java.util.*

/**
 * @author evgeny.demkin@moex.com
 */
class TreeNode<T>(val value:T ){
  var children = ArrayList<TreeNode<T>>()

  fun add(value: T):TreeNode<T> {
    val newNode = TreeNode(value)
    children.add(newNode)
    return newNode
  }
}

fun <T> dfs(root: TreeNode<T>, order:ArrayList<String>){
  order.add(root.value.toString())
  for (child in root.children) {
    dfs(child, order)
  }
}

fun <T> bfs(root: TreeNode<T>, order:ArrayList<String>){
  val queue = LinkedList<TreeNode<T>>()
  queue.add(root)
  while(!queue.isEmpty()) {
    val head = queue.removeFirst()
    order.add(head.value.toString())
    for (child in head.children) {
      queue.add(child)
    }
  }
}
