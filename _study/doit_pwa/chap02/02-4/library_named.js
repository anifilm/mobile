// 외부와 공유할 conHello와 fnPlusNumbers라는 상수와 함수 선언
const conHello = '안녕하세요!';
const fnPlusNumbers = (pNum1, pNum2) => pNum1 + pNum2;

// 외부에서 사용할 수 있도록 내보내기
export { conHello, fnPlusNumbers };

// 다음과 같이 export 키워드를 선언문 앞에 써서 간단하게 내보내는 방법도 있다.
//export const conHello = '안녕하세요!';
//export const fnPlusNumbers = (pNum1, pNum2) => pNum1 + pNum2;
