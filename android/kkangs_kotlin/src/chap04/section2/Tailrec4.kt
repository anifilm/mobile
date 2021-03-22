// 꼬리 재귀함수
@file:Suppress("NO_TAIL_CALLS_FOUND", "NON_TAIL_RECURSIVE_CALL")
package chap04.section2

tailrec fun tailrecSum(n: Int): Int {
    if (n <= 0)
        return n
    else
        return n + tailrecSum(n - 1)
}

tailrec fun tailrecSum2(n: Int, result: Int = 0): Int {
    if (n <= 0)
        return result
    else
        return tailrecSum2(n - 1, n + result)
}

fun main() {
    println(tailrecSum(3))
    println(tailrecSum2(3))
}
