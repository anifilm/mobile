// 범위 값으로 분기, 집합 데이터로 조건
package chap06.section1

fun main() {
    val list = listOf<String>("hello", "world", "kkang")
    val array = arrayOf<String>("one", "two", "three")
    val data4 = "kkang"
    when (data4) {
        in list -> println("data4 in list")
        in array -> println("data4 in array")
    }
}

