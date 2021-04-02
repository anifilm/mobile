// 보조 생성자 여러 개의 경우 생성자 연결
package chap07.section2.thisEx

// 보조 생성자 여러 개
class User2(name: String) {
    constructor(name: String, age: Int): this(name) { }
    constructor(name: String, age: Int, email: String): this(name, age) { }
}

fun main() {
    // 보조 생성자 여러 개 선언된 경우 객체 생성
    val user3 = User2("kkang")
    val user4 = User2("kkang", 30)
    val user5 = User2("kkang", 30, "test@test.com")
}
