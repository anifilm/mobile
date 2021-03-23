// 배열
package chap05.section2

fun main() {
    // xxxArrayOf() 함수 사용
    var arrayInt2 = intArrayOf(10, 20, 30)
    var arrayDouble = doubleArrayOf(10.0, 20.0, 30.0)

    // Array 클래스를 이용한 배열
    var array3 = Array(3, {i -> i * 10})
    println("${array3[0]} .. ${array3[1]} .. ${array3[2]}")
}

/*
booleanArrayOf()
byteArrayOf()
charArrayOf()
shortArrayOf()
intArrayOf()
longArrayOf()
floatArrayOf()
doubleArrayOf()
 */

// { i -> i * 10 }
fun some(i: Int): Int {
    return i * 10
}
