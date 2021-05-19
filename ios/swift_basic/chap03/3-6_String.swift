// 코드 3-6 String
let name: String = "anifilm"  // 상수로 선언된 문자열은 변경할 수 없다.

// 이니셜라이저를 사용하여 빈 문자열을 생성할 수 있다.
// var 키워드를 사용하여 변수를 생성했으므로 문자열의 수정 및 변경 가능
var introduce: String = String()

introduce.append("제 이름은")  // append() 메서드를 사용하여 문자열을 이어 붙일 수 있다.
introduce = introduce + " " + name + "입니다."  // + 연산자를 통해서도 문자열을 이어 붙일 수 있다.
print(introduce)

print("name의 글자 수: \(name.count)")  // name에 해당하는 문자의 수를 셀 수 있다.
print("introduce가 비어있는가? : \(introduce.isEmpty)")  // 빈 문자열인지 확인

let unicodeScalarValue: String = "\u{2665}"  // 유니코드의 스칼라 값을 사용하면 값에 해당하는 표현이 출력된다.
print(unicodeScalarValue)
