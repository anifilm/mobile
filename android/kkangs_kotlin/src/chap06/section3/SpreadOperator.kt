// 전개 연산자
package chap06.section3
import java.util.Arrays.asList

fun main() {
    val array1 = arrayOf(10, 20, 30)

    // 배열 데이터 나열
    val list1 = asList(1, 2, array1[0], array1[1], array1[2], 100, 200)
    list1.forEach({println(it)})

    // 전개 연산자 사용
    val list2 = asList(1, 2, *array1, 100, 200)
    list2.forEach({println(it)})
}
