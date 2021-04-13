void main() {
  // Check for an empty string.
  var owner = '';
  print(owner.isEmpty);
  print("".isEmpty == true);

  // String with only white space are not empty.
  print('  '.isEmpty == false);

  // Trim a string.
  print('\thello  '.trim()); // "hello"

  // length (UTF16 characters)
  print('Google'.length); // 6
  print('구글'.length); // 2

  // startsWith, endsWith, contains
  var fullName = 'Larry Page';
  print(fullName.startsWith('La')); // 문자열 앞부분에 'La' 문자열이 있는가?
  print(fullName.endsWith('age')); // 문자열 뒷부분에 'age' 문자열이 있는가?
  print(fullName.contains('y P')); // 문자열에 'y P' 문자열을 포함하는가?

  // replaceAll, strings are immutable
  var composer = 'Johann Sebastian Bach';
  var s = composer.replaceAll('a', '-'); // 문자열에서 'a'를 '-'로 치환
  print(s); // Joh-nn Seb-sti-n B-ch
  print(s != composer); // 원본값은 바뀌지 않는다. (비파괴적 함수)

  // Get the character (as a string) by index.
  var lang = "Dart";
  print(lang[0]); // "D"

  // find the location of a string inside a string.
  print(lang.indexOf("ar")); // 1

  // extracting data from a string
  print("20000 rabbits".substring(9, 13)); // "bits", 9부터 13이전 인덱스까지

  // use StringBuffer instead of frequent concatenation
  var sb = new StringBuffer();
  sb.write("Use a StringBuffer ");
  sb.writeAll(["for ", "efficient ", "string ", "creation "]);
  sb.write("if you are ");
  sb.write("building lots of strings.");

  var fullString = sb.toString();
  print(fullString);
  print(fullString ==
      'Use a StringBuffer for efficient string creation '
          'if you are building lots of strings.');
  sb.clear(); // sb is empty again

  //sb = new StringBuffer(); // sb is empty again
  print(sb.toString() == '');

  // splitting a String
  var number = "075-0623456-72";
  var parts = number.split('-');
  print(parts); // [075, 0623456, 72]

  var joinParts = parts.join('+');
  print(joinParts); // "075+0623456+72"
}
