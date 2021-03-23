// 배열
package chap05.section2

fun main() {
    // arrayOf() 함수 사용
    var array = arrayOf<Any>(1, "kkang", true)
    array[0] = 10
    array[2] = "world"
    println("${array[0]} .. ${array[1]} .. ${array[2]}")
    println("size: ${array.size} .. ${array.get(0)} .. ${array.get(1)} .. ${array.get(2)}")

    // 배열의 타입 한정
    var arrayInt = arrayOf<Int>(10, 20, 30)
    println("${arrayInt.get(0)} .. ${arrayInt.get(1)} .. ${arrayInt.get(2)}")
}
