// 보조 생성자와 주 생성자가 함께 선언된 경우
package chap07.section2.thisEx

// 주 생성자와 보조 생성자 함께 선언
class User1(name: String) {
    init {
        println("init block... $name")
    }
    constructor(name: String, age: Int): this(name) {
        println("contructor... $name .. $age")
    }
}

fun main() {
    println("----- 주 생성자로 생성한 경우 -----")
    val user1 = User1("kkang")
    println("----- 보조 생성자로 생성한 경우 -----")
    val user2 = User1("kkang", 33)
}
