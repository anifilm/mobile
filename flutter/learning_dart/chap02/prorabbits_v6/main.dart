import 'dart:math';

const int NO_YEARS = 10;
const int GROWTH_FACTOR = 15;

calc(years) => (2 * pow(e, log(GROWTH_FACTOR) * years)).round().toInt();

lineOut(years, fun) {
  print('After $years years:\t ${fun} animals');
}

void main() {
  print("The number of rabbits increases as:\n");
  for (int years = 0; years <= NO_YEARS; years++) {
    lineOut(years, calc(years));
  }
}
