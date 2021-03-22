// 범위 연산자
package chap06.section3

fun main() {
    var sum = 0
    for (i in 1..10) {  // 1부터 10까지
        sum += 1
    }
    println(sum)

    println("5 in 1..10 : ${5 in 1..10}")  // 5는 1..10 범위 안에 있는가?
}
