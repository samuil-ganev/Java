class Fan {

  private final int SLOW = 1, MEDIUM = 2, FAST = 3;
  private int speed = SLOW;
  private bool switchedOn = false;
  private double radius = 5;
  private String color = "blue";

  Fan() {}

  int getSpeed() {

    return this.speed;

  }

  void setSpeed(String speed) {

    switch (speed) {

      case "SLOW":
        speed = SLOW;
        break;
      case "MEDIUM":
        speed = MEDIUM;
        break;
      case "FAST":
        speed = FAST;
        break;
      default:
        break;

    }

  }

  bool isSwitchedOn() {

    return this.switchedOn;

  }

  void switchFan(String onof) {

    if (onof) { this.switchedOn = true; } else { this.switchedOn = false; }

  }

  double getRadius() {

    return this.radius;

  }

  void setRadius (double radius) {

    this.radius = radius;

  }

  String getColor() {

    return this.color;

  }

  String setColor(String color) {

    this.color = color;

  }

  String tostring() {

    return Integer.toString(this.speed) + Double.toString(this.radius) + color;

  }

}
