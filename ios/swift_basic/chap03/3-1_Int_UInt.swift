// 코드 3-1 Int와 UInt (64비트 운영체제에서는 Int64, UInt64 이다.)
var integer: Int = -100
let unsignedInteger: UInt = 50  // UInt 타입에는 음수값을 할당할 수 없다.
print("integer 값: \(integer), unsignedInteger 값: \(unsignedInteger)")

print("Int 최대값: \(Int.max), Int 최소값: \(Int.min)")
print("UInt 최대값: \(UInt.max), UInt 최소값: \(UInt.min)")

let largeInteger: Int64 = Int64.max
let smallUnsignedInteger: UInt8 = UInt8.max
print("Int64 최대값: \(largeInteger), UInt8 최대값: \(smallUnsignedInteger)")

//let tooLarge: Int = Int.max + 1  // Int의 표현 범위를 초과하므로 오류
//let cannotBeNegetive: UInt = -5  // UInt는 음수가 될 수 없으므로 오류

//integer = unsignedInteger  // 오류 발생, 스위프트에서 Int와 UInt는 다른 타입이다.
integer = Int(unsignedInteger)  // Int 타입으로 형 변환 후 할당
