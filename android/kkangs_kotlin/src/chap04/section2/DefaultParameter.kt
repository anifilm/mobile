// 매개변수에 기본값 사용
package chap04.section2

fun sayHello3(name: String = "kkang") {  // 매개변수 기본값 (default parameter) 지정
    println("Hello, $name!")
}

fun main() {
    sayHello3()
    sayHello3("kim")  // 전달하는 값, 인자(argument)
}
