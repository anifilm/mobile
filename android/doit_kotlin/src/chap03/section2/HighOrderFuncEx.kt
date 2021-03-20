package chap03.section2

fun main() {
    println(highFunc({ x, y -> x + y }, 10, 20))  // 람다식 함수를 인자로 넘김
}

fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a, b)  // sum 매개변수는 함수

/*

함수형 프로그래밍의 정의와 특징
- 순수 함수를 사용해야 한다.
- 람다식을 사용할 수 있다.
- 고차 함수를 사용할 수 있다.

 */
