webLanguage([name]) => 'The best web language is: $name';
webLanguage2([name = 'Dart']) => 'The best web language is: $name';

String hi(String msg, [String? from, String? to]) => '$msg from $from to $to';
String hi2(String msg, [String from = 'me', String to = 'you']) =>
    '$msg from $from to $to';
String hi3(String msg, {String? from, String? to}) => '$msg from $from to $to';
String hi4(String msg, {String from: 'me', String to: 'you'}) =>
    '$msg from $from to $to';

void main() {
  print(webLanguage());
  print(webLanguage('JavaScript'));
  print(webLanguage2());
  print(webLanguage2('JavaScript'));

  // optional positional parameters [param]
  print(hi('hi'));
  print(hi('hi', 'me'));
  print(hi('hi', 'me', 'you'));

  // optional positional parameters with default values [param = value]
  print(hi2('hi'));
  print(hi2('hi', 'him'));
  print(hi2('hi', 'him', 'her'));

  // optional named parameters {param}
  print(hi3('hi'));
  print(hi3('hi', to: 'you'));
  print(hi3('hi', to: 'you', from: 'me'));

  // optional named parameters with default values {param: value};
  print(hi4('hi'));
  print(hi4('hi', to: 'her'));
  print(hi4('hi', from: 'you'));
}
