// 보조 생성자와 초기화 블록
package chap07.section2.secondaryConstructor

class User5 {
    init {
        println("i am init block...")  // 가장 먼저 실행
    }
    constructor() {
        println("i am constructor...") // 초기화 블록 이후 실행
    }
}

fun main() {
    val user8 = User5()
}
