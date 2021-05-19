// 코드 3-7 String 타입의 타양한 기능

// 연산자를 통한 문자열 결합
var hello: String = "Hello"
let yagom: String = "yagom"
var greeting: String = hello + " " + yagom + "!"
print(greeting) // "Hello yagom!"

greeting = hello
greeting += " "
greeting += yagom
greeting += "!"
print(greeting) // "Hello yagom!"

// 연산자를 통한 문자열 비교
var isSameString: Bool = false

isSameString = hello == "Hello"
print(isSameString) // true

isSameString = hello == "hello"
print(isSameString) // false

// 메서드를 통한 접두어, 접미어 확인
var isHasPrefix: Bool = false
isHasPrefix = hello.hasPrefix("He")
print(isHasPrefix) // true

isHasPrefix = hello.hasPrefix("HE")
print(isHasPrefix) // false

var hasSuffix: Bool = false
hasSuffix = hello.hasSuffix("He")
print(hasSuffix) // false

hasSuffix = hello.hasSuffix("llo")
print(hasSuffix)  // true

// 메서드를 통한 대소문자 변환
var convertedString: String = ""
convertedString = hello.uppercased()
print(convertedString)  // "HELLO"

convertedString = hello.lowercased()
print(convertedString)  // "hello"

// 프로퍼티를 통한 빈 문자열 확인
var isEmptyString: Bool = false
isEmptyString = greeting.isEmpty
print(isEmptyString)  // false

greeting = ""
isEmptyString = greeting.isEmpty
print(isEmptyString)  // true

// 프로퍼티를 이용해 문자열 길이 확인
print(greeting.count)  // 0

greeting = "안녕하세요"
print(greeting.count)  // 5

greeting = "안녕!"
print(greeting.count)  // 3

// 여러 줄의 문자열
greeting = """
안녕하세요 저는 임채영입니다.
스위프트 잘하고 싶어요!
잘 부탁드립니다.
"""
print(greeting)
