// JSON.stringify()와 JSON.parse() 함수 사용 예시
let myObj = {
  name: '홍길동',
  age: 35,
  email: 'sjyou@somedomain.com',
};

strJSON = JSON.stringify(myObj);
console.log(strJSON); // 텍스트 형태로 출력

newObj = JSON.parse(strJSON);
console.log(newObj); // 객체 형태로 출력
