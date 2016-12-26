package ru.demkin.alg.structures

/**
 * @author evgeny.demkin@moex.com
 */
class BinaryTreeNode<T>(val value:T) {
  var left: BinaryTreeNode<T>? = null
  var right: BinaryTreeNode<T>? = null
}

fun <T> dfs(root:BinaryTreeNode<T>?):String {
  if (root == null) {
    return ""
  }
  dfs(root.left)
  dfs(root.right)
  return ""
}




