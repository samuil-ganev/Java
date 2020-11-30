class ATM {

  public static void main(String[] args) {

    Account[] accounts = new Account[10];
    
    for (int i=0;i<10;++i)
      accounts[i] = new Account(i, 100);

    boolean chosen = false;
    int id = 11;

    while (true) {

      while (!chosen) {

        System.out.println("Enter an id: ");
        id = new java.util.Scanner(System.in).nextInt();

        if (id >= 0 && id < 11)
          chosen = true;

      }

      System.out.println("Main menu \n1: check balance \n2: withdraw \n3: deposit \n4: exit \nEnter a choice:");

      int option = new java.util.Scanner(System.in).nextInt();

      switch (option) {

        case 1:
          System.out.println("The balance is " + accounts[id].getBalance()); break;
        case 2:
          System.out.println("Enter an amount to withdraw: ");
          double wd = new java.util.Scanner(System.in).nextDouble();
          accounts[id].withdraw(wd); break;
        case 3:
          System.out.println("Enter an amount to deposit: ");
          double dep = new java.util.Scanner(System.in).nextDouble();
          accounts[id].deposit(dep); break;
        case 4:
          chosen = false; break;
        default:
         System.out.print("Error");

      }

    }

  }

}
