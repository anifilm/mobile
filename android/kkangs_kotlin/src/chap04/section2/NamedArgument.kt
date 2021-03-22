package chap04.section2

fun sayHello(name: String = "kkang", no: Int) {
    println("Hello $name!")
}

fun main() {
  //sayHello(10)  // 오류 (어느 매개변수에 전달할지 알 수 없음)
    sayHello("lee", 20)
    sayHello(no = 10)
    sayHello(name = "kim", no = 10)
}
