// 콜백 함수를 이용한 비동기 처리

// 콜백 함수 실행
fnMsg(fnHello);

// 콜백 함수는 3 출력 후 실행
function fnMsg(fnCallback) {
  console.log('1');
  fnCallback();
  console.log('3');
}

function fnHello() {
  setTimeout(() => {
    console.log('2');
  }, 1000);
}
