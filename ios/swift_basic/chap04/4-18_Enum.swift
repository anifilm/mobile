// 코드 4-18 열거형의 원시 값 일부 지정 및 자동 처리

enum School: String {
    case primary = "유치원"
    case elementary = "초등학교"
    case middle = "중학교"
    case high = "고등학교"
    case college
    case university
    case graduate
}

let highestEducationLevel: School = School.university
print("저의 최종학력은 \(highestEducationLevel.rawValue) 졸업입니다.")
// "저의 최종학력은 university 졸업입니다."

print(School.elementary.rawValue) // "초등학교"

enum Numbers: Int {
    case zero
    case one
    case two
    case ten = 10
}

print("\(Numbers.zero.rawValue), \(Numbers.one.rawValue), \(Numbers.two.rawValue), \(Numbers.ten.rawValue)")
// 0, 1, 2, 10

// 코드 4-19 원시 값을 통한 열거형 초기화

let primary = School(rawValue: "유치원")  // primary
let graduate = School(rawValue: "석박사") // nil

let one = Numbers(rawValue: 1)   // one
let three = Numbers(rawValue: 3) // nil
