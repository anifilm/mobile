void main() {
  // empty list
  var empty = [];
  var empty2 = List.filled(0, 0, growable: true); // equivalent
  assert(empty.isEmpty && empty2.isEmpty && empty.length == 0);

  // defining lists
  var langs = ['Java', 'Python', 'Ruby', 'Dart'];
  var readOnlyList = const ['Java', 'Python', 'Ruby', 'Dart'];
  //List langs2 = ['Java', 'Python', 'Ruby', 'Dart'];
  assert(langs is List);
  print('${langs.contains('Dart')}'); // true

  var langBest = langs[3];
  assert(langBest == 'Dart');

  langs[2] = 'PHP';
  print(langs);

  //langs[4] = 'F#'; // RangeError!
  var langs2 = List.filled(0, '', growable: true);
  langs2.add('C');
  langs2.add('C#');
  langs2.add('D');
  print(langs2); // [C, C#, D]
  langs2[2] = 'JavaScript';
  print(langs2); // [C, C#, JavaScript]

  //langs2[4] = 'f#'; // RangeError!
  var langs3 = List.filled(4, 'Dart');
  print(langs3);

  // splitting a String into a List
  var number = '075-0623456-72';
  var parts = number.split('-');
  print('$parts'); // [075, 0623456, 72]
  // joining (the items of) a List to a String
  var str = parts.join('-');
  assert(number == str);
}
