import java.util.Scanner;

public class CheckingAccount extends Account {

    double overdraftLimit;
    
    public CheckingAccount (int id, double balance, double overdraftLimit) {
    
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
        
    }
    
    public void withdraw () {
    
        Scanner sc = new Scanner(System.in);
        double withdrawalAmount = -1;
        
        do {
        
            System.out.println("Please enter withdrawl ammount that does not exceed " + (overdraftLimit + super.getBalance()));
            withdrawalAmount = sc.nextDouble();
            
        } while(withdrawalAmount < 0 || withdrawalAmount > overdraftLimit + super.getBalance());
        
        super.withdraw(withdrawalAmount);
        sc.close();
        
    }
    
}
