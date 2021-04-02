// 생성자 매개변수 선언시 var, val 사용
package chap07.section2

class User6(val name: String, val age: Int) {
    val myName = name
    init {
        println("i am init... constructor argument: $name .. $age")
    }

    fun sayHello() {
        // 생성자 매개변수 선언시 val 정의 되었으므로 프로퍼티로 사용 가능
        println("hello $name")
    }
}

fun main() {
    val user8 = User6("kkang", 33)
    user8.sayHello()
}
