// 생성자 매개변수 이용
package chap07.section2

class User5(name: String, age: Int) {
    // (2) 생성자 매개변수는 프로퍼티에 대입한 후 사용 가능
    val name = name
    init {
        println("i am init... constructor argument: $name .. $age")
    }
    val upperName = name.toUpperCase()

    fun sayHello() {
        // (1) 생성자 매개변수는 멤버 함수에서는 직접 사용은 불가
        println("hello $name")
    }
}

fun main() {
    val user7 = User5("kkang", 33)
    user7.sayHello()
}
