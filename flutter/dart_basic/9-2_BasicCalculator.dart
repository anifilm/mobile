import 'dart:io';

void main() {
  stdout.write('Enter first number: ');
  double num1 = double.parse(stdin.readLineSync().toString());
  stdout.write('Enter second number: ');
  double num2 = double.parse(stdin.readLineSync().toString());

  print(num1 + num2);
}
