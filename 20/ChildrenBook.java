// package myonlineshop;

class ChildrenBook extends Book {

  private int age;

  ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {

    super(regularPrice, publisher, yearPublished);

    this.age = age;

  }

  public double computeSalePrice() {
   
    return super.computeSalePrice() * 1.4;
  
  }

}
