// library_named.js 파일에서 내보낸 식별자를 가져와 conHello, fnPlusNumbers 객체에 저장
import { conHello, fnPlusNumbers } from './library_named.js';

console.log(conHello, '외부 모듈 이름으로 불러오기 { conHello, fnPlusNumbers }');
console.log('1 + 2 = ', fnPlusNumbers(1, 2));

// library_named.js 파일에서 내보낸 모든 식별자를 가져와 myLibrary 객체에 저장
import * as myLibrary from './library_named.js';

console.log(myLibrary.conHello, '*을 사용하여 외부 모듈 불러오기 (* as myLibrary)');
console.log('3 + 4 = ', myLibrary.fnPlusNumbers(3, 4));

// 외부에서 기본 모듈로 내보냈으므로 이름을 변경해서 가져올 수 있다.
import fnMyfunction from './library_default.js';

console.log('안녕하세요! 외부 기본 모듈 불러오기 (이름 변경)');
console.log('5 + 6 = ', fnMyfunction(5, 6));
