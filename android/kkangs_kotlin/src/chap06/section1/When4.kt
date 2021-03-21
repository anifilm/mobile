// 범위 값으로 분기, 데이터 범위 조건
package chap06.section1

fun main() {
    val data3 = 15
    when (data3) {
        !in 1..100 -> println("invalid data")
        in 1..10 -> println("1 <= data3 <= 10")
        in 11..20 -> println("11 <= data3 <= 20")
        else -> println("data3 > 20")
    }
}

