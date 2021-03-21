// while 반복문
package chap06.section2

fun main() {
    var x = 0
    var sum1 = 0
    while (x < 10) {
        sum1 += ++x
    }
    println(sum1)
}
