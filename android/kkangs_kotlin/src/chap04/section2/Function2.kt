package chap04.section2

// Unit으로 함수의 반환 타입 명시
fun sum2(a: Int, b: Int): Unit {
    // 반환값이 없다.
}

// Unit 생략
fun sum3(a: Int, b: Int) {
    // 반환값이 없다면 Unit 생략 가능
}

/*
함수의 반환값이 없을 때는 Unit으로 타입을 명시한다. 이는 생략될 수 있다.
 */
