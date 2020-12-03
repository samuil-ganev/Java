class Main {

  public static void main(String[] args) {

    City[] cities = {
      new City("Sofia", 1_300_000, "BG"),
      new City("Varna", 400_000, "BG"),
      new City("Plovdiv", 300_000, "BG"),
    };

    Country bg = new Country(cities, "BG");

    bg.tostring();

  }

}
