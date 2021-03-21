// 정수 이외의 값으로 분기, 다양한 타입의 when 조건
package chap06.section1

fun main() {
    val data1 = "hello"
    when (data1) {
        "hello" -> println("data is hello")
        "wolrd" -> println("data is world")
        else -> println("data1 is not hello or world")
    }
}
