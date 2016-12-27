package ru.demkin.alg.structures

/**
 * @author evgeny.demkin@moex.com
 */
class ImmutableNode<T>(val value:T) {

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is ImmutableNode<*>) return false
    if (value != other.value) return false
    return true
  }

  override fun hashCode(): Int {
    return value?.hashCode() ?: 0
  }

  override fun toString(): String {
    return "ImmutableNode(value=$value)"
  }
}
