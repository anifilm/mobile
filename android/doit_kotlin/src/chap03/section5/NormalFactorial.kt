// 일반적인 팩토리얼의 재귀 함수 만들기
package chap03.section5

fun main() {
    val number = 4
    val result: Long

    result = factorial(number)
    println("Factorial: $number -> $result")
}

fun factorial(n: Int): Long {
    return (
        if (n == 1)
            n.toLong()
        else
            n * factorial(n - 1)
    )
}

/*

재귀 함수의 조건
- 무한 호출에 빠지지 않도록 탈출 조건을 만들어 둔다.
- 스택 영역을 이용하므로 호출 횟수를 무리하게 많이 지정해 연산하지 않는다.
- 코드를 복잡하지 않게 한다.

 */
