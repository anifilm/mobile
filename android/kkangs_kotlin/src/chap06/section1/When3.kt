// 여러 값으로 분기, 여러 조건을 한꺼번에 명시
package chap06.section1

fun some() = 50

fun main() {
    val data2 = 30
    when (data2) {
        10, 20 -> println("data2 is 10 or 20")
        30, 40 -> println("data2 is 30 or 40")
        some() -> println("data2 is 50")
        30 + 30 -> println("data2 is 60")
    }
}
