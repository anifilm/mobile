var name: String = "yagom"
var age: Int = 100
var job = "iOS Programmer"  // 타입 추론 사용
var height = 181.5  // 실수 타입의 타입 추론
//print("\(type(of: height))")  // Double
age = 99  // 변수 값 재 할당
job = "Writer"  // 값 변경시 기존 타입과 같은 값을 할당해야 한다.
print("저의 이름은 \(name)이고, 나이는 \(age)세이며, 직업은 \(job)입니다. 비밀이지만, 키는 \(height)센티미터입니다.")
