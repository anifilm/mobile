// 객체 생성
package chap07.section1

class MyClass {
    var name: String = "world"

    fun sayHello() {
        println("hello $name")
    }
}

fun main() {
    val obj1 = MyClass()
    val obj2 = MyClass()

    obj1.name = "kkang"
    obj2.name = "kim"

    obj1.sayHello()
    obj2.sayHello()
}
