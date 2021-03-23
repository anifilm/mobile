// MutableList 사용
package chap05.section2

fun main() {
    val mutableList: MutableList<String> = mutableListOf("hello", "world")
    mutableList.add("kkang")
    mutableList.set(1, "korea")
    println("${mutableList.get(0)} .. ${mutableList.get(1)} .. ${mutableList.get(2)}")
}
