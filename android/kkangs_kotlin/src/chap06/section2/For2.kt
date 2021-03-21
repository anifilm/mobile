// 컬렉션 타입 이용, 컬렉션 타입 데이터에 의한 반복
package chap06.section2

fun main() {
    val list = listOf("Hello, ", "world", "!")
    val sb = StringBuffer()
    for (str in list) {
        sb.append(str)
    }
    println(sb)
}
