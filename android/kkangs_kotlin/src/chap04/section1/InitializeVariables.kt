// 변수 초기화
package chap04.section1

val topData1: Int = 10  // 전역 상수 선언과 동시 초기화
var topData2: Int = 20  // 전역 변수 선언과 동시 초기화

class User {
    val objData1: String = "hello"  // 멤버 상수 선언과 동시 초기화
    var objData2: String = "world"  // 멤버 변수 선언과 동시 초기화

    fun some() {
        val localData1: Int    // 지역 상수 선언 (초기화X)
        var localData2: String // 지역 변수 선언 (초기화X)

        localData1 = 40  // 지역 상수 값 할당 (초기화, 값은 한번만 할당될 수 있다.)
        println(localData1)

        localData2 = "hello"  // 지역 변수 값 할당
        println(localData2)
    }
}
