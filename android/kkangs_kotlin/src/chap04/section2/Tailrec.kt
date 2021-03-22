// 로직이 반복되는 일반 함수
package chap04.section2

fun loopPrint(no: Int = 1) {
    var count = 1
    while (true) {
        println("loopPrint...")
        if (no == count)
            return
        else
            count++
    }
}

fun main() {
    loopPrint(3)
}
