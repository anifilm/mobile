// Any 타입
package chap05.section1

fun getLength(obj: Any): Int {
    if (obj is String) {
        return obj.length
    }
    return 0
}

fun main() {
    println(getLength("Hello"))
    println(getLength(10))
}

/*
데이터 타입의 최상위 클래스는 Any이며 어떤 타입의 데이터도 대입할 수 있다.
 */
