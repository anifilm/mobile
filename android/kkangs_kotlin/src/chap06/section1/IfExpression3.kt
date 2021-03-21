// if 표현식의 반환값 (else는 생략될 수 없다. 반드시 있어야 함)
package chap06.section1

fun main() {
    val a = 5
    val result3 = if (a > 10) 20
    else if (a > 20) 30
    else 10
    println(result3)
}
