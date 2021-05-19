// 코드 4-3 Tuple 기본

// String, Int, Double 타입을 갖는 튜플
var person: (String, Int, Double) = ("anifilm", 100, 172.5)

// 인덱스를 통해서 값을 출력할 수 있다.
print("이름: \(person.0), 나이: \(person.1), 신장 \(person.2)")

person.0 = "채영"
person.1 = 44 // 인덱스를 통해 값을 할당
person.2 = 169.4

print("이름: \(person.0), 나이: \(person.1), 신장 \(person.2)")
