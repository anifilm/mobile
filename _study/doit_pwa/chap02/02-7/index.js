// Promise의 로직 예시

// 가상의 서버 데이터 요청 및 그 결과 랜덤값 반환
function RequestData() {
  return Math.random() > 0.5;
}

// Promise 생성하는 부분
const oProductReady = new Promise((fnResolve, fnReject) => {
  // 실행 중 결과 기다림(pending)
  const time = 1000 + Math.random() * 3;
  console.log('결과 기다리는 중...');

  setTimeout(() => {
    let bStatus = RequestData();

    if (bStatus) {
      // 요청한 실행이 성공함(resolved)
      fnResolve('상품이 성공적으로 배송되었습니다.');
    } else {
      // 실행 중 결과 기다림(pending)
      fnReject('죄송합니다. 상품이 아직 준비되지 못했습니다.');
    }
  }, time);
});

// Promise 실행 최종 결과
oProductReady
  .then((pResult) => {
    // 약속 지킴, 최종 성공(filfilled)
    console.log(pResult);
  }).catch((pErrMsg) => {
    // 약속 못 지킴, 최종 실패(unfulfilled)
    console.log(pErrMsg);
  });
