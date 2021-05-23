// 커스텀 Getter와 Setter 사용하기
package chap06.section1.customgetset

import java.util.*

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.uppercase(Locale.getDefault()) // 받은 인자를 대문자로 변경해 프로퍼티에 할당
        }
    var age: Int = _age
}

fun main() {
    val user1 = User(1, "Cheayoung", 44)
    user1.name = "coco" // 여기서 사용자 고유의 출력 코드를 실행
    println("user1.name = ${user1.name}")
}
