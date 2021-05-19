// 코드 4-5 튜플 별칭 지정
typealias PersonTuple = (name: String, age: Int, height: Double)

let yagom: PersonTuple = ("yagom", 100, 178.5)
let eric: PersonTuple = ("eric", 150, 183.5)

print("이름: \(yagom.name), 나이: \(yagom.age), 신장: \(yagom.height)")
print("이름: \(eric.name), 나이: \(eric.age), 신장: \(eric.height)")
