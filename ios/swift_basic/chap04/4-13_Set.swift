// 코드 4-13 Set의 활용 - 포함관계 연산

let bird: Set<String> = ["비둘기", "닭", "기러기"]
let mammal: Set<String> = ["사자", "호랑이", "곰"]
let animal: Set<String> = bird.union(mammal) // 새와 포유류의 합집합

print(bird.isDisjoint(with: mammal)) // 서로 배타적인지 - true
print(bird.isSubset(of: animal))     // 새가 동물의 부분 집합인가? - true
print(animal.isSuperset(of: mammal)) // 동물은 포유류의 전체 집합인가? - true
print(animal.isSuperset(of: bird))   // 동물은 새의 전체 집합인가? - true
