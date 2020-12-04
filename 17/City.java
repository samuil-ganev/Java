class City {

  private String name;
  private int population;
  private Citizen[] citizens;
  private String country;

  City(String name, String country) {

    this.name = name;
    this.country = country;

  }

  City(String name, int population, Citizen[] citizens, String country) {

    this.name = name;
    this.population = population;
    this.citizens = citizens;
    this.country = country;

  }

  public Citizen[] getCitizens() {

    return this.citizens;

  }

  public void setCitizens(Citizen[] citizens) {

    this.citizens = citizens;

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

  public void increacePopulation(int num) {

    this.population += num;

  }

  public void decreacePopulation(int num) {

    this.population -= num;

  }

  public void tostring() {

    System.out.println("City name: " + this.name);
    System.out.println("Population: " + this.population);
    System.out.println("Country name: " + this.country);

  }

}
