// 값에 의한 호출로 람다식 사용하기
package chap03.section3

fun main() {
    val result = callByValue(lambda())  // lambda() -> 람다식 함수 먼저 호출 -> callByValue() 함수 호출
    println(result)
}

fun callByValue(b: Boolean): Boolean {  // 일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {  // 람다 표현식이 2줄
    println("lambda function")
    true  // 마지막 표현식 문장의 값을 반환
}
