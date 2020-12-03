class City {

  private String name;
  private int population;
  private String country;

  City(String name, int population, String country) {

    this.name = name;
    this.population = population;
    this.country = country;

  }

  public String getName() {

    return this.name;

  }

  public int getPopulation() {

    return this.population;

  }

  public String getCountry() {

    return this.country;

  }

  public void setName(String name) {

    this.name = name;

  }

  public void setPopulation(int population) {

    this.population = population;

  }

  public void setCountry(String name) {

    this.country = name;

  }

  public void tostring() {

    System.out.println("City name: " + this.name);
    System.out.println("Population: " + this.population);
    System.out.println("Country name: " + this.country);

  }

}
