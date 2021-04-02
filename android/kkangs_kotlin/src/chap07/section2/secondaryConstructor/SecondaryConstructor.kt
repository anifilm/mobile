// 보조 생성자
package chap07.section2.secondaryConstructor

class MyClass1 { }   // 생성자 선언이 없다면 컴파일러가 매개변수가 없는 주 생성자를 자동 생성

class MyClass2(name: String) { }  // 주 생성자만 선언

class MyClass3 {
    constructor(name: String) { } // 보조 생성자만 선언
}

fun main() {
    val obj1 = MyClass1()
    val obj2 = MyClass2("kkang")
//  val obj3 = MyClass3  // 오류
    val obj4 = MyClass3("kkang")
}
