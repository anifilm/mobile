// 매개변수와 프로퍼티 동일 이름으로 선언
package chap07.section2

class User7(name: String, age: Int) {
    val name: String = "kim"
    init {
        // 초기화 블록에서는 생성자 매개변수로 전달 받은 값을 출력한다.
        println("i am init... constructor argument: $name")
    }

    fun sayHello() {
        // 멤버 함수에서는 프로퍼티의 값을 출력하게 된다.
        println("hello $name")
    }
}

fun main() {
    val user9 = User7("kkang", 33)
    user9.sayHello()
}
