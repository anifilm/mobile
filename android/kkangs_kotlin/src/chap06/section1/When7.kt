// if-else 대체용으로 사용
package chap06.section1

fun main() {
    val data5 = 15
    when {
        data5 <= 10 -> println("data5 < 10")
        data5 > 10 && data5 <= 20 -> println("10 < data5 <= 20")
        else -> println("data5 > 20")
    }
}

