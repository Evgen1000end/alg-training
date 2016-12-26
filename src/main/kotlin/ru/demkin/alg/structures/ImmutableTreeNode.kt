package ru.demkin.alg.structures

/**
 * @author evgeny.demkin@moex.com
 */
class ImmutableTreeNode<T>(val value:T, val children:List<ImmutableTreeNode<T>>)

fun <T> dfs(root:ImmutableTreeNode<T>){
  println(root.value)
  for (child in root.children) {
    dfs(child)
  }
}

