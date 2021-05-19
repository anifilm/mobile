// 코드 3-4 Float과 Double
var floatValue: Float = 1234567890.1  // Flaot이 수용할 수 있는 범위를 넘어서게 되면 정확도가 떨어진다.
let doubleValue: Double = 1234567890.1  // Double은 충분히 수용할 수 있다.

print("floatValue: \(floatValue), doubleValue: \(doubleValue)")

floatValue = 123456.1  // Float이 수용할 수 있는 범위의 값으로 변경

// 템플릿 문자열을 사용하지 않고 단순히 변수 또는 상수의 값만 보고 싶으면
// print 함수의 전달인자로 변수 또는 상수를 전달하면 된다.
print(floatValue)
