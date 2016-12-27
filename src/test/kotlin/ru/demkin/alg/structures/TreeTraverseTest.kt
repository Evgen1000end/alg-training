package ru.demkin.alg.structures

import org.testng.Assert
import org.testng.annotations.Test
import java.util.*

/**
 * @author evgeny.demkin@moex.com
 */
class TreeTraverseTest {

  @Test
  fun dfsTest(){
    val root = TreeNode(1)
    val child1 = root.add(2)
    child1.add(3)
    child1.add(4)

    val child2 = root.add(5)
    child2.add(6)
    child2.add(7)
    val actual = ArrayList<String>()
    dfs(root,actual)

    Assert.assertEquals(actual, arrayListOf("1", "2", "3", "4", "5", "6", "7"))
  }

  @Test
  fun bfsTest(){
    val root = TreeNode(1)
    val child1 = root.add(2)
    child1.add(3)
    child1.add(4)

    val child2 = root.add(5)
    child2.add(6)
    child2.add(7)
    val actual = ArrayList<String>()
    bfs(root,actual)

    Assert.assertEquals(actual, arrayListOf("1", "2", "5", "3", "4", "6", "7"))
  }
}


