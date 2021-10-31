// Promise로 비동기 처리 함수 생성
function fnProductReady(pNum, pTime) {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log(pNum);
      resolve('상품이 성공적으로 배송되었습니다.');
    }, pTime);
  });
}

// await 연산자 사용 예시
(async () => {
  const strRet = await fnProductReady(1, 2000)
  console.log(strRet);
})();
