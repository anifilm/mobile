enum Direction { North, South, East, West }

void main() {
  Direction dir = Direction.South;
  if (dir == Direction.South) {
    print("Let's go on a trip");
  }

  switch (dir) {
    case Direction.North:
      print('Too cold up there!');
      break;
    case Direction.South:
      print("Let's go on a trip!");
      break;
    case Direction.West:
      print('Better stay home!');
      break;
    case Direction.East:
      print('Which eastern county do you want to visit?');
      break;
  }
}
