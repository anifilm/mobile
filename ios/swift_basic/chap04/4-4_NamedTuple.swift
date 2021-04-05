// 튜플 요소 이름 지정

// String, Int, Double 타입을 갖는 튜플
var person: (name: String, age: Int, height: Double) = ("anifilm", 100, 172.5)

// 요소 이름을 통해서 값을 출력할 수 있다.
print("이름: \(person.name), 나이: \(person.age), 신장 \(person.height)")

person.name = "채영"
person.age = 44  // 요소 이름을 통해 값을 할당
person.2 = 169.4 // 인덱스를 통해서도 값을 할당할 수 있다.

// 기존처럼 인덱스를 이용해서 값을 출력할 수 있다.
print("이름: \(person.0), 나이: \(person.1), 신장 \(person.2)")
