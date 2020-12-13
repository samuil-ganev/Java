class ComicBook extends Book {

  private String characterName;

  ComicBook(double regularPrice, String publisher, int yearPublished, String characterName) {

    super(regularPrice, publisher, yearPublished);

    this.characterName = characterName;

  }

  public double computeSalePrice() {
   
    return super.getRegularPrice() * 0.4;
  
  }

}
