import 'dart:html';

InputElement task;
UListElement list;

void main() {
  task = querySelector('#task');
  list = querySelector('#list');
  task.onChange.listen(addItem);
}

void addItem(e) {
  var newTask = LIElement();
  newTask.text = task.value;
  task.value = '';
  list.children.add(newTask);
}
