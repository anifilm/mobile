// 일치 연산자 (일반 객체의 경우)
package chap06.section3

fun main() {
    class User
    val user1 = User()
    val user2 = User()
    val user3 = user1
    println("user1 == user2 is ${user1 == user2}")   // false, 다른 값을 가지고 있다.
    println("user1 === user2 is ${user1 === user2}") // false, 다른 객체이다.
    println("user1 == user3 is ${user1 == user3}")   // true, 같은 값을 가지고 있다.
    println("user1 === user3 is ${user1 === user3}") // true, 같은 객체이다.
}

/*
연산자     사용법       설명
 ==       A == B      A와 B가 같은 값이면 true
 !=       A != B      A와 B가 다른 값이면 true
 ===      A === B     A와 B가 같은 객체이면 true
 !==      A !== B     A와 B가 다른 객체이면 true

Java ==
primitive type 값을 비교
reference type 주소를 비교 (객체를 비교)

Java Equals()
reference의 객체가 가진 값을 비교하기 위해서는 equals()를 사용해야 한다.
 */
