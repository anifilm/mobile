// 연산자 재정의
package chap06.section4

data class MyClass(val no: Int) {
    operator fun plus(arg: Int): Int {
        return no - arg
    }
}

operator fun MyClass.minus(arg: Int): Int {
    return no + arg
}

class Test(val no: Int) {
    operator fun plus(arg: Int): Int {
        return no - arg
    }
}

fun main() {
    val obj: MyClass = MyClass(10)

    val result1 = obj + 5  //  5, 재정의 된 연산자에 의해 뺄셈을 연산
    val result2 = obj - 5  // 15, 재정의 된 연산자에 의해 덧셈을 연산

    println("result1: $result1 ... result2: $result2")

    println("${Test(30) + 5}")
}
