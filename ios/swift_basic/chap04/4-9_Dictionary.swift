// 코드 4-9 Dictionary의 사용

var numberForName: [String: Int] = ["yagom": 100, "chulsoo": 200, "jenny": 300]

print(numberForName["chulsoo"]) // 200
print(numberForName["minji"]) // nil

numberForName["chulsoo"] = 150
print(numberForName["chulsoo"]) // 150

numberForName["max"] = 999  // max라는 키로 999라는 값을 추가
print(numberForName["max"]) // 999

print(numberForName.removeValue(forKey: "yagom")) // 100

// 위에서 yagom 키에 해당하는 값이 이미 삭제되었으므로 nil이 반환된다.
// 키에 해당하는 값이 없으면 기본값을 돌려주도록 할 수도 있다.
print(numberForName.removeValue(forKey: "yagom"))

// yagom 키에 해당하는 값이 없으면 기본으로 0이 반환된다.
print(numberForName["yagom", default: 0]) // 0
