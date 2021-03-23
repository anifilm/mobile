// 타입 확인과 캐스팅
package chap05.section1

// 형 변환 에러
//var a1: Int = 10
//var a2: Double = a1  // 오류 발생, 자동 형 변환을 지원하지 않는다.

// 형 변환 함수 사용
var a1: Int = 10
var a2: Double = a1.toDouble()

/*
toByte()    Byte   타입으로 형 변환
toShort()   Short  타입으로 형 변환
toInt()     Int    타입으로 형 변환
toLong()    Long   타입으로 형 변환
toFloat()   Float  타입으로 형 변환
toDouble()  Double 타입으로 형 변환
toChar()    Char   타입으로 형 변환
 */

// 값의 형 변환
val l = 1L + 3 // Long + Int => Long
