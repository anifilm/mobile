package chap03.section2

fun main() {
    println(sum(1, 2))
}

// 순수 함수의 예
fun sum(a: Int, b: Int): Int {
    return a + b  // 동일한 인자인 a, b를 입력받아 항상 a + b를 출력 (부작용이 없음)
}

/*

순수 함수의 조건
- 같은 안지에 대하여 항상 같은 값을 반환한다.
- 함수 외부의 어떤 상태도 바꾸지 않는다.

 */
