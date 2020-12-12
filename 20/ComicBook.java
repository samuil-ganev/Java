class ComicBook {

  private String characterName;

  ComicBook(double regularPrice, String publisher, int yearPublished, String characterName) {

    super(regularPrice, publisher, yearPublished);

    this.characterName = characterName;

  }

  public double computeSalePrice() {
   
    return super.computeSalePrice() * 1.2;
  
  }

}
