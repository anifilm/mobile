// when에서 Any 사용
package chap05.section1

fun cases(obj: Any): String {
    when (obj) {
        1 -> return "One"
        "Hello" -> return "Greeting"
        is Long -> return "Long"
        !is String -> return "Not a string"
        else -> return "unknown"
    }
}

fun main() {
    println(cases(1))
    println(cases(10))
}
