// 코드 4-8 Dictionary 선언과 생성

// typealias를 통해 조금 더 단순하게 표현해볼 수도 있다.
typealias StringIntDictionary = [String: Int]

// 키는 String, 값은 Int 타입인 빈 딕셔너리를 생성
var numberForName: Dictionary<String, Int> = Dictionary<String, Int>()

// 위 선언과 같은 표현. [String: Int]는 Dictionary<String, Int>의 축약 표현
var numberForName: [String: Int] = [String: Int]()

// 위 코드와 같은 동작을 한다.
var numberForName: [String: Int] = [:]

// 초기값을 주어 생성해줄 수 있다.
var numberForName: [String: Int] = ["yagom": 100, "chulsoo": 200, "jenny": 300]

print(numberForName.isEmpty) // false
print(numberForName.count)   // 3
