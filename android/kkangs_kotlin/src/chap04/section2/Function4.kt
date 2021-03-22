// 함수 표현식
package chap04.section2

// 중괄호를 이용한 함수 선언
fun some(a: Int, b: Int): Int {
    return a + b
}

// 함수 표현식
fun some2(a: Int, b: Int): Int = a + b

// 함수 표현식, 반환 타입 생략
fun some3(a: Int, b: Int) = a + b
