// 중첩 반복문에 break문 사용
package chap06.section2

fun main() {
    for (i in 1..3) {
        for (j in 1..3) {
            if (j > 1) break
            println("i: $i, j: $j")
        }
    }
}
