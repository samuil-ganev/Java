// package myonlineshop;

class ChildrenBook extends Book {

  private int age;

  ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {

    super(regularPrice, publisher, yearPublished);

    this.age = age;

  }

  public double computeSalePrice() {
   
    return super.getRegularPrice() * 0.3;
  
  }

}
