class Main {

  public static void main(String[] args) {

    Citizen[] citizens1 = {

      new Citizen("Ivan", 32, "Sofia", "BG"),
      new Citizen("Petko", 22, "Sofia", "BG"),
      new Citizen("Kris", 17, "Sofia", "BG")

    };

    Citizen[] citizens2 = {

      new Citizen("Ivan", 32, "Varna", "BG"),
      new Citizen("Petko", 22, "Varna", "BG"),
      new Citizen("Kris", 17, "Varna", "BG")

    };

    Citizen[] citizens3 = {

      new Citizen("Ivan", 32, "Plovdiv", "BG"),
      new Citizen("Petko", 22, "Plovdiv", "BG"),
      new Citizen("Kris", 17, "Plovdiv", "BG")

    };

    City[] cities = {

      new City("Sofia", 1_300_000, citizens1, "BG"),
      new City("Varna", 400_000, citizens2, "BG"),
      new City("Plovdiv", 300_000, citizens3, "BG")

    };

    Country bg = new Country(cities, "BG");

    bg.tostring();
    citizens1[1].tostring();

  }

}
