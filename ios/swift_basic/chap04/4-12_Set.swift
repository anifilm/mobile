// 코드 4-12 Set의 활용 - 집합연산

let englishClassStudents: Set<String> = ["john", "chulsoo", "yagom"]
let koreanClassStudents: Set<String> = ["jenny", "yagom", "chulsoo", "hana", "minsoo"]

// 교집합 {"yagom", "chulsoo"}
let intersectSet: Set<String> = englishClassStudents.intersection(koreanClassStudents)

// 여집합의 합(배타적 논리합) {"john", "jenny", "hana", "minsoo"}
let symmetricDiffSet: Set<String> = englishClassStudents.symmetricDifference(koreanClassStudents)

// 합집합 {"minsoo", "jenny", "john", "yagom", "chulsoo", "hana"}
let unionSet: Set<String> = englishClassStudents.union(koreanClassStudents)

// 차집합 {"john"}
let subtractSet: Set<String> = englishClassStudents.subtracting(koreanClassStudents)

print(unionSet.sorted()) // ["chulsoo", "hana", "jenny", "john", "minsoo", "yagom"]
