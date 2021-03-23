// 배열
package chap05.section2

fun main() {
    // 각 타입의 배열 클래스 이용
    var array4 = Array<Int>(3, {i -> i * 10})
    var array5 = IntArray(3, {i -> i * 10})

    // 빈 배열 만들기
    var array6 = arrayOfNulls<Any>(3)
    array6[0] = 10
    array6[1] = "hello"
    array6[2] = true
    println("${array6[0]} .. ${array6[1]} .. ${array6[2]}")

    var emptyArray = Array<String>(3, {""})
    emptyArray[0] = "hello"
    emptyArray[1] = "world"
    emptyArray[2] = "kkang"
    println("${emptyArray[0]} .. ${emptyArray[1]} .. ${emptyArray[2]}")
}

/*
BooleanArray
ByteArray
CharArray
ShortArray
IntArray
LongArray
FloatArray
DoubleArray
 */
