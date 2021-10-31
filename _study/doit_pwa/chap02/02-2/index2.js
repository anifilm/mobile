// var 함수 스코프 예시 2

var apple = 3;

{
  var apple = 5; // var 키워드는 블록 스코프를 무시한다.
  console.log(apple ); // 5
}

console.log(apple); // 5
