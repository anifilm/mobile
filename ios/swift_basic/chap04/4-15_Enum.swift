// 코드 4-15 열거형의 선언

enum School {
    case primary, elementary, middle, high, college, university, graduate
}

// 코드 4-16 School 열거형 변수의 생성 및 값 변경

var highestEducationLevel: School = School.university

// 위 코드와 정확히 같은 표현
var highestEducationLevel: School = .university

// 같은 타입인 School 내부의 항목으로만 highestEducationLevel의 값을 변경해줄 수 있다.
highestEducationLevel = .graduate
