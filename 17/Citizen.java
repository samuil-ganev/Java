class Citizen {

  private String name;
  private int age;
  private City city;

  Citizen(String name, int age, String city, String country) {

    this.name = name;
    this.age = age;
    this.city = new City(city, country);

  }

  public String getName() {

    return this.name;

  }

  public int getAge() {

    return this.age;

  }

  public City getCity() {

    return this.city;

  }

  public void setName(String name) {

    this.name = name;

  }

  public void setAge(int age) {

    this.age = age;

  }

  public void setCity(String city, String country) {

    this.city = new City(city, country);

  }

  public void tostring() {

    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    this.city.tostring();

  }

}
