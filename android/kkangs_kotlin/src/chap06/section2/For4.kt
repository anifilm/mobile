// 컬렉션 타입의 인덱스와 값 모두 이용, withIndex() 이용
package chap06.section2

fun main() {
    val list = listOf("Hello, ", "world", "!")
    for ((index, value) in list.withIndex()) {
        println("the element at $index is $value")
    }
}
