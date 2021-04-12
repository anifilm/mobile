import 'dart:io';

void main() {
  stdout.write('Enter a color: ');
  String color = stdin.readLineSync().toString();

  stdout.write('Enter a plural noun: ');
  String pluralNoun = stdin.readLineSync().toString();

  stdout.write('Enter a celebrity: ');
  String celebrity = stdin.readLineSync().toString();

  print("Roses are $color");
  print("$pluralNoun are blue");
  print("I love $celebrity");
}
