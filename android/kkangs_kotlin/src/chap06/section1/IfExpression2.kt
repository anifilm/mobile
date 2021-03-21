// if 표현식의 반환값
package chap06.section1

fun main() {
    val a = 5
    val result2 = if (a < 10) {
        print("hello...")
        10 + 20  // 반환값
    }
    else {
        print("world...")
        20 + 20  // 반환값
    }
    println(result2)
}
