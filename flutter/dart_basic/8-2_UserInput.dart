import 'dart:math';
import 'dart:io';

void main() {
  stdout.write('Enter first number: ');
  int num1 = int.tryParse(stdin.readLineSync() ?? 0);
  stdout.write('Enter second number: ');
  int num2 = int.tryParse(stdin.readLineSync() ?? 0);

  print(num1 + num2);
}
