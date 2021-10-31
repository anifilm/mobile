// Promise로 비동기 처리 함수 생성
function fnProductReady(pNum, pTime) {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log(pNum);
      resolve('상품이 성공적으로 배송되었습니다.');
    }, pTime);
  });
}

// async 함수 사용법 (동기로 처리되기 때문에 순차적으로 실행된다.)
async function fnDoAsyncFunc() {
  console.log(await fnProductReady(1, 2000));
  console.log(await fnProductReady(2, 1000));
  console.log(await fnProductReady(3, 500));
}

fnDoAsyncFunc();
