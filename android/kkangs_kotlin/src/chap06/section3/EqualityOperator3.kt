// 일치 연산자 (기초 데이터 타입 객체)
@file:Suppress("DEPRECATED_IDENTITY_EQUALS")
package chap06.section3

fun main() {
    // 기초 데이터 타입 객체, Integer
    val int1 = Integer(10)
    val int2 = Integer(10)
    val int3 = int1
    println("int1 == int2 is ${int1 == int2}")   // true, 같은 값을 가지고 있다.
    println("int1 === int2 is ${int1 === int2}") // false, 다른 객체 이다.
    println("int1 == int3 is ${int1 == int3}")   // true, 같은 값을 가지고 있다.
    println("int1 === int3 is ${int1 === int3}") // true, 같은 객체 있다.

    // 기초 데이터 타입 객체, Int
    val data1: Int = 10
    val data2: Int = 10
    println("data1 == data2 is ${data1 == data2}")   // true, 같은 값을 가지고 있다.
    println("data1 === data2 is ${data1 === data2}") // true, 같은 객체 있다.

    // 기초 데이터 타입 객체, null 허용
    val data3 = 1000
    val data4 = 1000
    val data5: Int? = 1000
    val data6: Int? = 1000
    println("data3 == data4 is ${data3 == data4}")   // true, 같은 값을 가지고 있다.
    println("data3 === data4 is ${data3 === data4}") // true, 같은 객체 이다.
    println("data5 == data6 is ${data5 == data6}")   // true, 같은 값을 가지고 있다.
    println("data5 === data6 is ${data5 === data6}") // false, 다른 객체 이다.
}
