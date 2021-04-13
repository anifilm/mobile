void main() {
  final name = 'John'; // final 변수 선언, 타입 생략 (선언 이후 값을 변경할 수 없다.)
  //final String name = 'John'; // 타입을 명시하여 상수 선언
  //var name = 'Mia'; // 오류 발생, 동일한 지역 변수명 사용
  //name = 'Lucy'; // 오류 발생, final 변수는 선언시 할당된 값을 변경할 수 없다.
  print(name);

  const SECINMIN = 60;
  const SECINDAY = SECINMIN * 60 * 24;
  print('$SECINDAY'); // 86400

  int daysInWeek = 7;
  final fdaysInYear = daysInWeek * 52; // final 변수는 런타임 상수 (선언시 값이 정해지는 경우 사용)
  //const DAYSINYEAR = daysInWeek * 52; // 오류 발생, const 변수는 컴파일타임 상수 (값의 변경 가능성이 있으면 안됨, 무조건 고정값을 사용)
  print(fdaysInYear); // 364
}
