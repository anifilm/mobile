// 생성자 오버로딩
package chap07.section2.secondaryConstructor

class User4 {
    constructor() { }
    constructor(name: String) { }
    constructor(name: String, age: Int) { }
}

fun main() {
    val user5 = User4()
    val user6 = User4("kkang")
    val user7 = User4("kkang", 10)
}
