// 함수 내에 함수 선언
package chap04.section2

fun sum4(a: Int, b: Int): Int {
    var sum = 0
    fun calSum() {
        for (i in a..b) {
            sum += i
        }
    }
    calSum()
    return sum
}

fun main() {
    val result = sum4(1, 10)
    println(result)
}
