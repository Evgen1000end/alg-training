package ru.demkin.alg.structures

import org.testng.annotations.Test

import org.testng.Assert.*
import java.util.*


/**
 * @author evgeny.demkin@moex.com
 */
class SingleLinkedListTest {

  @Test
  fun testAdd() {
    val list = SingleLinkedList<Int>()
    list.add(2)
    list.add(3)
    list.add(4)
  }

  @Test
  fun reverseTest(){
    val list = SingleLinkedList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    val actual = ArrayList<String>()
    reverseTraverseRecursive(list, actual)
    assertEquals(actual, arrayListOf("4","3","2","1"))
  }

  @Test
  fun getTest() {
    val list = SingleLinkedList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    assertEquals(list.get(0).value, 1)
    assertEquals(list.get(1).value, 2)
    assertEquals(list.get(2).value, 3)
    assertEquals(list.get(3).value, 4)
  }

  @Test
  fun emptyListException(){
    val list = SingleLinkedList<Int>()
    list.get(0)
  }

  @Test
  fun arrayBoundListException(){
    val list = SingleLinkedList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list.get(4)
  }


}
