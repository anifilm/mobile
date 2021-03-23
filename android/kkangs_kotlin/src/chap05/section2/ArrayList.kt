// ArrayList 사용
package chap05.section2

fun main() {
    val arrayList: ArrayList<String> = ArrayList()
    arrayList.add("hello")
    arrayList.add("kkang")
    arrayList.set(1, "world")
    println("${arrayList.get(0)} .. ${arrayList.get(1)}")
}
