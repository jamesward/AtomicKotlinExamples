// Abstract/NoStateInInterfaces.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package abstractclasses

interface IntList {
  val name: String
  // Doesn't compile:
  // val list = listOf(0)
}
