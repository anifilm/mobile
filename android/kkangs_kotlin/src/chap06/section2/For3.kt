// 컬렉션 타입의 인덱스값 이용, indices 사용
package chap06.section2

fun main() {
    val list = listOf("Hello, ", "world", "!")
    for (i in list.indices) {
        println(list[i])
    }
}
