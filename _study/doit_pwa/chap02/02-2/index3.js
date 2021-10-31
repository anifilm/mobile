// 블록 스코프 예시

{
  let apple = 3;
  console.log(apple); // 3
  apple = 5;
  console.log(apple); // 5
  //let apple = 7; // 중복 선언을 허용되지 않으므로 오류!

  //const car; // 선언과 동시에 값을 할당하지 않으므로 오류!
  const carname = '하이브리드카';
  console.log(carname); // 하이브리드카
  //carname = '디젤카';  // const 선언 변수는 불변이므로 오류!
}

console.log(apple);   // 블록 밖이므로 오류!
console.log(carname); // 블록 밖이므로 오류!
