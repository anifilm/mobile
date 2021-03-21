// if 문
package chap06.section1

fun main() {
    val a = 5
    if (a < 10)
        println("$a < 10")
    // if - else
    if (a > 0 && a <= 20) {
        println("0 < $a <= 10")
    }
    else if (a > 10 && a <= 20) {
        println("10 < $a <= 20")
    }
    else {
        println("$a > 20")
    }
}
