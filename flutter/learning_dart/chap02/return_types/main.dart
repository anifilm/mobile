/* void display(message) { // 반환형이 void인 경우 반환값은 null 이다.
  print('Message: $message.');
}*/
// 화살표 함수
display(message) => print('Message: $message.');

/*String displayStr(message) {
  return 'Message: $message.';
}*/
// 반환 타입 생략
displayStr(message) {
  return 'Message: $message.';
}

//String displayStrShort(message) => 'Message: $message.';
// 반환 타입 생략
displayStrShort(message) => 'Message: $message.';

bool isOdd(n) => n % 2 == 1;

// different alternatives are commented out
void main() {
  print(display('Hello')); // "Message: Hello." => null
  print(displayStr('Hello')); // "Message: Hello."
  print(displayStrShort('Hello')); // "Message: Hello."
  print(display(display("What's up?"))); // "Message: null." => null
  print('${isOdd(13)}'); // true
  print([1, 2, 3, 4, 5].where(isOdd).toList()); // [1, 3, 5]
}
