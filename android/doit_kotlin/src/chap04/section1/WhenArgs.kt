// when문을 이용해 점수 등급 구하기
package chap04.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when (score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9  -> grade = 'B'
        in 70.0..79.9  -> grade = 'C'
       !in 70.0..100.0 -> grade = 'F'
    }

    println("Score: $score, Grade: $grade")
}

/*

코틀린의 when문은 자바의 switch문과 비슷하다.

 */
