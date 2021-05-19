// 코드 1-2 명령형 프로그래밍 패러다임과 함수형 프로그래밍 패러다임의 비교 (함수형)

// doSomething 함수와 doAnotherThing 함수를 모두 처리하고 싶은 경우

// 함수형 프로그래밍 패러다임
func doSomething() {
    print("do somthing")
}

func doAnotherThing() {
    print("do another thing")
}

func excute(tasks: [()-> Void]) {
    for task in tasks {
        task()
    }
}

excute(tasks: [doSomething, doAnotherThing])


// 두 수의 합을 구하고 싶은 경우

// 명령형 프로그래밍 패러다임
func sum(first: Int) -> ((Int) -> Int) {
    return { second in first + second }
}

sum(first: 10)(5)
