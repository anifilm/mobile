// 전개 연산자를 사용자 정의 함수에 사용, vararg로 전개 연산자 데이터 선언
package chap06.section3

fun some(vararg a: String) {
    val iterator = a.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}

fun main() {
    val array3 = arrayOf<String>("hello", "world")
    some(*array3)
}
