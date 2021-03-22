// tailrec 재귀함수
package chap04.section2

tailrec fun tailrecPrint(no: Int = 1, count: Int = 1) {
    println("tailrecPrint...")
    return (
        if (no == count)
            return
        else
            tailrecPrint(no - 1, count)
    )
}

fun main() {
    tailrecPrint(3)
}
