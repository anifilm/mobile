// 생성자 초기화 블록 init
package chap07.section2

class User4(name: String, age: Int) {
    init {
        println("i am init...")
    }
}

fun main() {
    val user6 = User4("kkang", 33)
}

/*
주 생성자는 클래스 에더에 명시하다 보니 실행문을 포함할 수 없다는 문제가 있다.
실행 영역을 클래스 몸체에 init 예약어로 따로 명시하여 사용할 수 있다.
 */
