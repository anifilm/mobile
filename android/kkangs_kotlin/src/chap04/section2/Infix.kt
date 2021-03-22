// 함수의 중위 표현식
package chap04.section2

// 함수 확장
infix fun Int.myFun(x: Int): Int {
    return x * x
}

class FunClass {
    infix fun infixFun(a: Int) {
        println("infixFun call...")
    }
}

fun main() {
    val obj = FunClass()
    obj.infixFun(10)
    // 중위 표현식
    obj infixFun 10

    println(10 myFun 10)
    println(10.myFun(10))
}
