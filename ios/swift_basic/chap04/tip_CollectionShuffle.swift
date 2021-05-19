// TIP 컬렉션에서 임의의 요소 추출과 뒤섞기

var array: [Int] = Array(1...45)
var set: Set<Int> = Set(1...5) // 요소의 순서를 보장하지 않는다.
var dictionary: [String: Int] = ["a": 1, "b": 2, "c": 3]
var string: String = "string"

//print(array.randomElement()) // 배열에서 임의의 요소 하나를 선택하여 반환
//print(array.shuffled()) // 배열 요소 섞기 (원본 수정 없음)
array.shuffle() // 배열 요소 섞기 (원본 수정)

let arraySlice = array.prefix(6) // 배열 요소 앞의 6개 요소를 추출
let newArray = Array(arraySlice)

print(newArray) // 로또 번호 출력

//print(set.shuffled()) // Set의 요소를 섞으면 배열로 값을 반환한다.
//set.shuffle() // 오류! Set은 순서를 보장하지 않으므로 요소를 섞을 수 없다.
//print(dictionary.shuffled()) // Dictionary를 섞으면 (키, 값)이 쌍을 이룬 튜플을 배열로 반환한다.
//print(string.shuffled()) // String도 컬렉션이다.
