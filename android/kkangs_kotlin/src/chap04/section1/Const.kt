// val 변수
package chap04.section1

var myBool = false
val myVal: String = "hello"
    get() {
        if (myBool)
            return field
        else
            return field.toUpperCase()
    }

fun main() {
    println(myVal)
    myBool = true
    print(myVal)
}
