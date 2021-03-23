// null 허용 데이터
package chap05.section1

//val a: Int = null
val b: Int? = null

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}
