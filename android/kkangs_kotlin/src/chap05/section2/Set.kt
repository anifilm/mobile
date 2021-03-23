// Set 이용
package chap05.section2

fun main() {
    val immutableSet = setOf<String>("hello", "hello", "world")
    println("${immutableSet.elementAt(0)} .. ${immutableSet.elementAt(1)}")

    val mutableSet = mutableSetOf<String>()
    mutableSet.add("hello")
    mutableSet.add("set")
    println("${mutableSet.elementAt(0)} .. ${mutableSet.elementAt(1)}")
}
