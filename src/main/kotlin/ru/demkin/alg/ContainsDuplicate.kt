package ru.demkin.alg

import java.util.*

/**
 * @author evgeny.demkin@moex.com
 */
/*
  O(n)
 */
fun hasDuplicate(nums:Array<Int>):Boolean {
  if (nums.size == 0) {
    return false
  }
  val appeared = HashSet<Int>()
  for (i in nums){
    if (!appeared.add(i)) {
      println("$i - already exists")
      return true
    } else {
      println("$i - unique")
    }
  }
  return false
}
