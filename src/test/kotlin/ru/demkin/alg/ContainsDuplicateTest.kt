package ru.demkin.alg

import org.testng.Assert
import org.testng.Assert.*
import org.testng.annotations.Test

/**
 * @author evgeny.demkin@moex.com
 */
class ContainsDuplicateTest {

  @Test
  fun shouldReturnTrueTest() {
    val hasDuplicate = hasDuplicate(arrayOf(1, 2, 1))
    assertTrue(hasDuplicate)
  }

  @Test
  fun shouldReturnFalseTest() {
    val hasDuplicate = hasDuplicate(arrayOf(1, 2, 3))
    assertFalse(hasDuplicate)
  }

}
