void main() {
  String greeting = 'Hello';
  print(greeting);
  print(greeting.length);
  print(greeting[0]);
  print(greeting.toUpperCase());
  print(greeting.toLowerCase());
  print(greeting.indexOf('e')); // 문자열에서 해당 문자(또는 문자열)의 인덱스를 반환
  print(greeting.contains('e')); // 문자열에서 해당 문자(또는 문자열)의 포함 유무 반환 (true/false)

  String greeting2 = 'World';
  print(greeting + greeting2); // 문자열 연결
  print('The greeting is: $greeting'); // 템플릿 문자열 출력
}
