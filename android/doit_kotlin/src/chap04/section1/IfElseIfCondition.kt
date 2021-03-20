// else if문을 사용한 등급 판별하기
package chap04.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()  // 콘솔로부터 입력받음 (아래 내용 참조)
    var grade: Char = 'F'

    // 논리합으로 연결된 조건
    if (score >= 90.0) {
        grade = 'A'
    }
    else if (score >= 80.0 && score <= 89.9) {
        grade = 'B'
    }
    else if (score >= 70.0 && score <= 79.9) {
        grade = 'C'
    }

    println("Score: $score, Grade: $grade")
}

/*

사용자 콘솔 입력시 (실수 입력, 예외 발생 가능성이 있으므로 예외 처리를 해야한다.)

readLind()!!.toDouble()

여기서 non-null 단정 기호 (!!.)를 사용하여 예외 처리
실수 이외의 값 (문자열 등) 이 입력되면 NumberFormatException 오류 발생

 */
