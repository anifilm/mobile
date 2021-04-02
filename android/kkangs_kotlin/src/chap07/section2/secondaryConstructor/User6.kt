// 보조 생성자의 매개변수
package chap07.section2.secondaryConstructor

class User6 {
    // 클래스 프로퍼티의 정의 필요
    val name: String = "kim"

    init {
        println("i am init block... $name")  // 클래스 프로퍼티 사용
    }
    constructor(name: String) {
        println("i am constructor... $name") // 보조 생성자 매개변수 사용
    }

    fun sayHello() {
        println("hello $name")  // 클래스 프로퍼티 사용
    }
}

fun main() {
    val user9 = User6("kkang")
}
