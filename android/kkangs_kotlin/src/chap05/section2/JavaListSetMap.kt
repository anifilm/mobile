package chap05.section2

import java.util.ArrayList
import java.util.HashSet
import java.util.HashMap

fun main() {
    val javaList: ArrayList<String> = ArrayList()
    javaList.add("hello")
    javaList.add("world")
    println("${javaList.get(0)} .. ${javaList.get(1)}")

    val javaMap: HashMap<String, String> = HashMap()
    javaMap.put("one", "hello")
    javaMap.put("two", "world")
    println("${javaMap.get("one")} .. ${javaMap.get("two")}")

    val javaSet: HashSet<String> = HashSet()
    javaSet.add("hello")
    javaSet.add("hello")
    javaSet.add("world")
    println("${javaSet.size} .. ${javaSet.elementAt(0)} .. ${javaSet.elementAt(1)}")

}
