// 변수 선언
package chap04.section1

// 전역 변수 선언
val data1: Int = 10
val data2 = 20
var data3 = 30

fun main() {
//  data2 = 40  // 상수 선언되었으므로 값을 변경할 수 없다.
    data3 = 40

    println("data1: $data1")
    println("data2: $data2")
    println("data3: $data3")
}

/*
val -> value    상수 선언
var -> variable 변수 선언

형식
val(혹은 var) 변수명: 타입 = 값
 */
