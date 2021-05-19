// 코드 2-7 상수의 선언 및 사용

let name: String = "aniiflm" // 차후 변경하지 않는 값은 상수로 선언
var age: Int = 100
var job = "iOS Programmer" // 타입 추론 사용
let height = 171.5
age = 44 // 변수의 값 변경
job = "Developer" // 값 변경시에는 기존과 같은 타입의 값을 할당해야 한다.
//name = "채영"   // 상수로 선언된 값을 변경하려고 하면 오류 발생
print("저의 이름은 \(name)이고, 나이는 \(age)세이며, 직업은 \(job)입니다. 비밀이지만, 키는 \(height)센티미터입니다.")
