// const 이용
package chap04.section1

const val myConst: Int = 10
//const var myConst2: Int = 10  // 변수는 const 선언할 수 없다.

class MyClass {
    //const val myConst3 = 30  // 멤버 상수는 const 선언할 수 없다.
}

fun some() {
    //const val myConst4 = 40  // 함수내 선언되는 상수는 const 선언할 수 없다.
}
