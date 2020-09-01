// Summary2/VarArgs.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package summary2

fun varargs(s: String, vararg ints: Int) {
  for (i in ints) {
    print("$i ")
  }
  println(s)
}

fun main() {
  varargs("primes", 5, 7, 11, 13, 17, 19, 23)
}
/* Output:
5 7 11 13 17 19 23 primes
*/
