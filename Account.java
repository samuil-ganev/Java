class Main {

  public static void main(String[] args) {
  
    Account user = new Account(1122, 20000);
    user.setYearInterestRate(4.5);

    user.withdraw(2500);
    user.deposit(3000);

    System.out.println(user.getBalance());
    System.out.println(user.getMonthlyInterest());
    System.out.println(user.getDateCreated());
  
  }

}

import java.util.Date;

class Account {

  private int id;
  private double balance, yearInterestRate;
  private Date dateCreated;

  Account() {

    this.id = 0;
    this.balance = 0;
    this.yearInterestRate = 0;
    dateCreated = new Date();

  }

  Account(int id, double balance) {

    this.id = id;
    this.balance = balance;

  }

  void setId(int id) {

    this.id = id;

  }

  int getId() {

    return this.id;

  }

  void setBalance(double balance) {

    this.balance = balance;

  }

  double getBalance() {

    return this.balance;

  }

  void setYearInterestRate(double yearInterestRate) {

    this.yearInterestRate = yearInterestRate;

  }

  double getYearInterestRate() {

    return this.yearInterestRate;

  }

  Date getDateCreated() {

    return this.dateCreated;

  }

  double getMonthlyInterestRate() {

    return this.yearInterestRate / 12;

  }

  double getMonthlyInterest() {

    return balance * this.getMonthlyInterestRate() / 100;

  }

  void withdraw(double withdrawAmount) {

    this.balance -= withdrawAmount;

  }

  void deposit(double dep) {

    this.balance += dep;

  }

}
