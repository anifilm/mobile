void main() {
  String country = "Egypt";
  String koreanForWorld = '세계';
  print(koreanForWorld);

  String q = "What's up?";
  String s1 = 'abc'
      "def";
  print(s1); // "abcdef"

  String multiLine = '''
<h1> Beautiful page </h1>
<div class="start"> This is a story about the landing
    on the moon </div>
<hr>
''';
  print(multiLine);

  String rawStr = r"Why don't you \t learn Dart!";
  print(rawStr); // "Why don't you \t learn Dart!"

  var emptyStr = ''; // empty string

  int n = 42;
  double pi = 3.14;
  int hex = 0xDEADBEEF;
  //int hugePrimeNumber = 4776913109852041418248056622882488319;
  BigInt hugePrimeNumber =
      BigInt.parse("4776913109852041418248056622882488319");
  double d1 = 12345e-4; // 1.2345
  var i1 = d1.round(); // 1.0

  bool selected = false;

  print(n);
  print(pi);
  print(hex);
  print(hugePrimeNumber);
  print(d1);
  print(i1);

  print(selected);

  // conversions (형변환)
  String lucky = 7.toString(); // 정수 -> 문자열
  int seven = int.parse('7'); // 문자열 -> 정수
  double pi2 = double.parse('3.1415'); // 문자열 -> 실수
  String pi2Str = pi2.toStringAsFixed(3); // 실수 -> 문자열 변환 (소수점 이하 자리수 3으로)
  print(pi2); // 3.1415
  print(pi2Str); // "3.142"

  var doubleSeven = seven.toDouble(); // 정수 -> 실수
  var intPi2 = pi2.toInt(); // 실수 -> 정수
  print(doubleSeven); // 7.0
  print(intPi2); // 3

  // operators (비교 연산)
  var i = 100;
  var j = 1000;
  var b1 = (i == j);
  var b2 = (i != j);
  print(b1); // false
  print(b2); // true

  // equality of strings
  var s = "strings are immutable";
  var t = "strings are immutable";
  print(s == t); // true, 같은 문자열인지 비교
  print(identical(s, t)); // true, 문자열 리터럴 객체가 같은 메모리 주소를 가지는지 비교

  // 데이터 타입 검사
  var b3 = (7 is num); // 7은 숫자인가?
  print(b3); // true

  var b4 = (7 is! double); // 7은 실수가 아닌가?
  print(b4); // true

  var b5 = (7 is int); // 7은 정수인가?
  print(b5); // true
  assert(b5);
}
