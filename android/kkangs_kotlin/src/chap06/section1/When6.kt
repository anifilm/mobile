// 여러 타입으로 분기, Any에 의한 조건
package chap06.section1

fun testWhen(data: Any) {
    when (data) {
        1 -> println("data value is 1")
        "hello" -> println("data value is hello")
        is Boolean -> println("data type is Boolean")
    }
}

fun main() {
    testWhen(1)
    testWhen("hello")
    testWhen(true)
}
