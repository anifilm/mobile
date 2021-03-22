// 문자열 템플릿
package chap05.section1

fun sum(no: Int): Int {
    var sum = 0;
    for (i in 1..no) {
        sum += i
    }
    return sum
}

fun main() {
    val name: String = "kkang"
    println("result: $name .. ${sum(10)}")
}
