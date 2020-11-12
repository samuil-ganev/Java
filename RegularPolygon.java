class RegularPolygon {

  private int n;
  private double sideLength;
  private double x;
  private double y;

  RegularPolygon() {

    n = 3;
    sideLength = 1;
    x = 0;
    y = 0;

  }

  RegularPolygon(int n, double sideLength) {

    this.n = n;
    this.sideLength = sideLength;
    x = 0;
    y = 0;

  }

  RegularPolygon(int n, double sideLength, double x, double y) {

    this.n = n;
    this.sideLength = sideLength;
    this.x = 0;
    this.y = 0;

  }

  void setN(int n) {

    this.n = n;

  }

  int getN() { return this.n; }

  void setSideLength(double sideLength) {

    this.sideLength = sideLength;

  }

  double getSideLength() { return this.sideLength; }

  void setX(double x) {

    this.x = x;

  }

  double getX() { return this.x; }

  void setY(double y) {

    this.y = y;

  }

  double getY() { return this.y; }

  double getPerimeter() {

    return n * sideLength;

  }

  double getArea() {

    return (n * sideLength * sideLength) / (4 * Math.tan(Math.PI / n));

  }

}
