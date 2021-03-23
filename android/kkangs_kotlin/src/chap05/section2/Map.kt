// Map 사용
package chap05.section2

fun main() {
    val immutableMap1 = mapOf<String, String>(Pair("one", "hello"), Pair("two", "world"))
    println("${immutableMap1.get("one")} .. ${immutableMap1.get("two")}")
    val immutableMap2 = mapOf<String, String>("one" to "hello", "two" to "kkang")
    println("${immutableMap2.get("one")} .. ${immutableMap2.get("two")}")

    val mutableMap = mutableMapOf<String, String>()
    mutableMap.put("one", "hello")
    mutableMap.put("two", "map")
    println("${mutableMap.get("one")} .. ${mutableMap.get("two")}")
}
