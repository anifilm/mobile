// 정수로 분기, when 사용
package chap06.section1

fun main() {
    val a2 = 1
    when (a2) {
        1 -> println("a2 == 1")
        2 -> println("a2 == 2")
        else -> {
            println("a2 is neither 1 nor 2")
        }
    }
}
