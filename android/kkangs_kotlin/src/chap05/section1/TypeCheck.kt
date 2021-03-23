// 타입 확인과 캐스팅
package chap05.section1

// 타입 확인
fun getStringLength(obj: Any): Int? {
    //val strData: String = obj  // 오류 발생
    if (obj is String) {
        return obj.length
    }
    return null
}

// !is 연산자 사용
fun getStringLength2(obj: Any): Int? {
    if (obj !is String)
        return null
    return obj.length
}
