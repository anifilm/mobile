// break
package chap06.section2

fun main() {
    var x2 = 0
    var sum2 = 0
    while (true) {
        sum2 += ++x2
        if (x2 == 10) break
    }
    println(sum2)
}
