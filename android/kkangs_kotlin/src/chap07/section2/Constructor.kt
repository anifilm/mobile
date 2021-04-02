// 주 생성자
package chap07.section2

class MyClass1 { }   // 생성자 선언이 없다면 컴파일러가 매개변수가 없는 주 생성자를 자동 생성

class MyClass2() { } // 생성자 예약어 생략

class MyClass3 constructor() { }  // 주 생성자 선언

fun main() {
    val obj1 = MyClass1()
    val obj2 = MyClass2()
    val obj3 = MyClass3()
}
