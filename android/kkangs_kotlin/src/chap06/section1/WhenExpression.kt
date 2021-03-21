// 표현식으로 사용
package chap06.section1

fun main() {
    val data6 = 3
    val result2 = when(data6) {
        1 -> "1..."
        2 -> "2..."
        else -> {
            println("else...")
            "hello"
        }
    }
    println(result2)
}
