// 논리 연산자의 동작 원리
package chap06.section3

fun main() {
    fun trueFun(): Boolean {
        println("call.. trueFun()")
        return true
    }
    fun falseFun(): Boolean {
        println("call.. falseFun()")
        return false
    }
    println("trueFun() && trueFun() : "); trueFun() && trueFun()
    println("falseFun() && trueFun() : "); falseFun() && trueFun()
    println("falseFun() || trueFun() : "); falseFun() || trueFun()
    println("trueFun() || trueFun() : "); trueFun() || trueFun()
}
