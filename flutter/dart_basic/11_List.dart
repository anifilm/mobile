void main() {
  List<int> favNums = [4, 8, 15, 16, 23, 42];
  print(favNums);
  print(favNums.length); // 6
  print(favNums[3]); // 16

  favNums[3] = 17;
  print(favNums[3]); // 17

  favNums.add(55); // 해당 요소값을 리스트의 맨 뒤에 추가
  print(favNums);

  favNums.remove(15); // 해당 요소값을 찾아서 삭제 (성공시 true, 실패시 false를 반환)
  print(favNums);

  print(favNums.indexOf(17)); // 해당 요소값의 인덱스를 반환 (없으면 -1을 반환)
  print(favNums.contains(18)); // 해당 요소값이 존재하는지를 반환 (true/false)
}
