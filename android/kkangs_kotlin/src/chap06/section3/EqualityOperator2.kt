// 일치 연산자 (일반 객체의 null 허용 경우)
package chap06.section3

fun main() {
    class User
    val user4 = User()
    val user5: User? = user4
    println("user4 == user5 is ${user4 == user5}")   // true
    println("user4 === user5 is ${user4 === user5}") // true
}
