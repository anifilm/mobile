// 레이블 사용
package chap06.section2

fun main() {
aaa@ for (i in 1..3) {
        for (j in 1..3) {
            if (j > 1) break@aaa
            println("i: $i, j: $j")
        }
    }
}

/*
중접 반복문 사용시 특정 조건에서 반복문 전체를 빠져나가야 할 때 사용 가능
 */
