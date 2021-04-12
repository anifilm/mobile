import 'dart:io';

void main() {
  stdout.write('Enter first number: ');
  String num1 = stdin.readLineSync().toString();
  stdout.write('Enter second number: ');
  String num2 = stdin.readLineSync().toString();

  print(int.parse(num1) + int.parse(num2));
}
