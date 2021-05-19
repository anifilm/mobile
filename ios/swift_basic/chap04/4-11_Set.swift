// 코드 4-11 Set의 사용

var names: Set<String> = ["yagom", "chulsoo", "younghee", "yagom"]

print(names.count) // 3
names.insert("jenny")
print(names.count) // 4

print(names.remove("chulsoo")) // chulsoo
print(names.remove("john"))    // nil
