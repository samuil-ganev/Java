class Triangle extends GeometricObject {

  private double side1, side2, side3;

  Triangle() {

    side1 = 1.0;
    side2 = 1.0;
    side3 = 1.0;

  }

  Triangle(double side1, double side2, double side3) {

    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;

  }

  public double getSide1() {

    return this.side1;

  }

  public double getSide2() {

    return this.side2;

  }

  public double getSide3() {

    return this.side3;

  }

  public double getArea() {

    double p = (side1 + side2 + side3) / 2;
    return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

  }

  public double printPerimeter() {

    return side1 + side2 + side3;

  }

  public String printRectangle() {

    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

  }

}
