// 매개변수가 있는 주 생성자
package chap07.section2

class User1 constructor(name: String, age: Int) { }

class User2(name: String, age: Int) { }

fun main() {
//  val user1 = User()  // 오류
    val user2 = User1("kkang", 33)
    val user3 = User2("kim", 28)
}
