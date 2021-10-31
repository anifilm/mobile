// Promise로 비동기 처리 함수 생성
function fnProductReady(pNum, pTime) {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log(pNum);
      resolve('상품이 성공적으로 배송되었습니다.');
    }, pTime);
  });
}

// 비동기 함수 실행
fnProductReady(1, 2000).then((result) => {
  console.log(result);
});
fnProductReady(2, 1000).then((result) => {
  console.log(result);
});
fnProductReady(3, 500).then((result) => {
  console.log(result);
});
