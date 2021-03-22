// nullable 변수
package chap04.section1

//val nonNullData: String = null  // (상수/변수) 선언시 직접적인 null 할당 불가
val nullableData1: String? = null
var nullableData2: String? = null

fun main() {
//  nullableData1 = "hello"  // null로 초기화 되었기 때문에 값을 할당할 수 없다.
    nullableData2 = "hello"
}
