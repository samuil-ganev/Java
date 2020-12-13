import java.util.Scanner;

public class SavingsAccount extends Account{  
    
    public SavingsAccount (int id, double balance) {
    
        super(id, balance);
        
    }
    
    
    public void withdraw () {
    
        Scanner sc = new Scanner(System.in);
        double withdrawalAmount = -1;
        
        do {
        
            System.out.println("Please enter withdrawl ammount that does not exceed " + super.getBalance());
            withdrawalAmount = sc.nextDouble();
            
        } while(withdrawalAmount < 0 || withdrawalAmount > super.getBalance());
        
        super.withdraw(withdrawalAmount);
        sc.close();
        
    }
    
}

