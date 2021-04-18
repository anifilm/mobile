class Project {
  String? name, description;

  toString() => 'Project name: $name - $description';
}

void main() {
  var p1 = new Project(); // 디폴트 생성자를 통한 인스턴스 객체 생성
  p1.name = 'Breeding';
  p1.description = 'Managing the breeding of animals';
  print('$p1');
}
