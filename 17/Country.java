class Country {

  private int countOfCities;
  private City[] cities;
  private String name;

  Country(City[] cities, String name) {

    this.cities = cities;
    this.name = name;
    this.countOfCities = cities.length;

  }

  public String getCountryName() {

    return this.name;

  }

  public City[] getCities() {

    return this.cities;

  }

  public int getCountOfCities() {

    return this.countOfCities;

  }

  public void setCountryName(String name) {

    this.name = name;

  } 

  public void setCity(String name, int population, int id) {

    cities[id] = new City(name, population, this.name);

  }

  public void tostring() {

    System.out.println("Name: " + this.name);
    System.out.println("Cities: ");

    for (City city : this.cities) {

      System.out.print(city.getName() + " ");

    }

  }

}
