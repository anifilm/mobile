// 생성자를 하나만 선언해서 사용하는 경우
package chap07.section2.secondaryConstructor

// 주 생성자로 선언
class User1(name: String, age: Int) { }

// 보조 생성자로 선언
class User2 {
    constructor(name: String, age: Int) { }
}

// 주 생성자와 보조 생성자 동시 선언
class User3(name: String) {
    constructor(name: String, age: Int): this(name) { }
}
/*
name 매개 변수는 객체 생성시 반드시 전달 받아야 하고 age 매개변수는 그렇지 않다면
주 생성자에는 반드시 전달 받아야 하는 매개변수만 정의, 선택적으로 전달받을 수 있는 매개변수를
포함하는 보조 생성자를 함께 선언하는 것이 좋다.
 */

fun main() {
    val user1 = User1("kkang", 30)
    val user2 = User2("kkang", 30)
}
