// 생성자 매개변수 기본값 명시
package chap07.section2

class User3(name: String, age: Int = 0) { }

fun main() {
    val user4 = User3("kkang", 33)
    val user5 = User3("kkang")
}
