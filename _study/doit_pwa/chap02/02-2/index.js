// var 함수 스코프 예시

fnMyFunction();

function fnMyFunction() {
  var apple = 5;
  console.log(apple); // 5
}

console.log(apple); // 오류! ReferenceError: apple is not defined
