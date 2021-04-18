void main() {
  var lstFun = [];
  for (var i in [10, 20, 30]) {
    // 익명 함수 객체를 리스트에 저장 (클로저 형태로 i 값을 저장하고 있다.)
    lstFun.add(() => print(i));
  }

  print(lstFun[0]()); // 10 => null
  print(lstFun[1]()); // 20 => null
  print(lstFun[2]()); // 30 => null
}
