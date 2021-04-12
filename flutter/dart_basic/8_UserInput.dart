import 'dart:io';

void main() {
  stdout.write('What is your name? ');
  var username = stdin.readLineSync();
  print("Hello ${username}");
}
