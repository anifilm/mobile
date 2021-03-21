// 증감 연산자
package chap06.section3

fun main() {
    // 후위 증가 연산 사용
    var data = 10
    var result1 = data++
    println("result1 = $result1, data = $data")

    // result = data++ 풀이
    var data2 = 10
    var result2 = data2
    data2 = data2 + 1
    println("result2 = $result2, data2 = $data2")

    // ++data
    var data3 = 10
    var result3 = ++data3
    println("result3 = $result3, data3= $data3")

    // result = ++data 풀이
    var data4 = 10
    data4 = data4 + 1
    var result4 = data4
    println("result4 = $result4, data4 = $data4")
}
