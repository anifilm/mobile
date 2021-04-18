// 반환형이 함수이다. (클로저 함수)
Function multiply(num n) {
  return (num i) => n * i;
}
// short version
//multiply(num n) => (num i) => n * i;

void main() {
  var two = 2;
  var mult2 = multiply(two);
  assert(mult2 is Function);
  print('$mult2(3)'); // 6
}
