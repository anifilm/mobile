// 매개 변수로 null을 받음
package chap04.section2

fun sayHello2(name: String?) {  // 전달받는 값, 매개변수(parameter)
    if (name == null)
        println("Hello!")
    else
        println("Hello, $name!")
}

fun main() {
    sayHello2(null)   // 인자로 null값을 전달
    sayHello2("kim")  // 전달하는 값, 인자(argument)
}
