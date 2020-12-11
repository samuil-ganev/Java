import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxSize = getNumProducts(in);
        int menuChoice;
        
        if(maxSize == 0) {
            
            System.out.println("No products required!");
            
        }else {
        
            Product[] products = new Product[maxSize];
            addToInventory(products, in);
            
            do {
            
                menuChoice = getMenuOption(in);
                executeMenuChoice(menuChoice, products, in);
            
            } while(menuChoice != 0);
        
        }
        
    }
    
    
    public static void displayInventory(Product[] arrayName) {
        for(Product product : arrayName) {
            System.out.println(product);
        
            }
    }
    
    
    public static void addToInventory(Product[] array, Scanner in) {
    
        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;
        
            for(int i = 0; i<array.length; i++) {
                in.nextLine();
                System.out.print("\n\nPlease enter the product name: ");
                tempName = in.nextLine();
                System.out.print("Please enter the quantity of stock for this product: ");
                tempQty = in.nextInt();
                System.out.print("Please enter the price for this product: ");
                tempPrice = in.nextDouble();
                System.out.print("Please enter the item number: ");
                tempNumber = in.nextInt();
                array[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
            }
            ProductTester.displayInventory(array);
            
            
        
    }
    
    
    public static int getNumProducts(Scanner in) {
        int maxSize = -1;
        do {
            try {        
                System.out.println("Enter the number of products you would like to add.");
                System.out.print("Enter 0 (zero) if you do not wish to add products: ");
                maxSize = in.nextInt();    
                
                if(maxSize<0)
                    System.out.println("Incorrect Value entered");
            }
            catch(InputMismatchException e) {
                System.out.println("Incorrect data type entered!");
                in.nextLine();
            }
            catch(Exception e){
                System.out.println(e);
                in.nextLine();
            }
        }while(maxSize<0);
        return maxSize;
    }
    
    
    public static int getMenuOption(Scanner sc) {
        int menuOption = -1;
        do {
            try {
                System.out.println("1. View inventory\n2. Add stock\n3. Desduct stock\n4. Discontinue product\n0. Exit\nPlease enter a menu option: ");
                menuOption = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Incorrect data type entered!");
            }
        }while(menuOption < 0 || menuOption > 4);
        return menuOption;
    }
    
    
    public int getProductNumber(Product[] array, Scanner sc) {
        int productChoice = -1;
        do {
            try {
                
                for (int i = 0; i < array.length; i++) {
                    System.out.println(i + ". " + array[i].getName());
                }
                
                System.out.println("Enter a product number: ");
                productChoice = sc.nextInt();
                
            } catch(InputMismatchException e) {
                System.out.println("Incorrect data type entered!");
                }
        }while(productChoice < 0 || productChoice > array.length - 1);
        
        return productChoice;
    }
    
    
    public void addInventory (Product[] array, Scanner sc) {
        int productChoice, updateValue = -1;
        productChoice = getProductNumber(array, sc);
        do {    
            try {
                System.out.println("How many products do you want to add?");
                updateValue = sc.nextInt();
            }catch(InputMismatchException e) {
                System.out.println("Incorrect data type entered!");
            }
        }while(updateValue>=0);
        array[productChoice].addToInventory(updateValue);
    }
    
    
    public void deductInventory (Product[] array, Scanner sc) {
        int productChoice, updateValue = -1;
        productChoice = getProductNumber(array, sc);
        do {    
            try {
                System.out.println("How many products do you want to deduct?");
                updateValue = sc.nextInt();
            }catch(InputMismatchException e) {
                System.out.println("Incorrect data type entered!");
            }
        }while(updateValue<=0 || updateValue >= array[productChoice].getQtyInStock());
        array[productChoice].deductFromInventory(updateValue);
    }
    
    
    public void discontinueInventory (Product[] array, Scanner sc) {
        int productChoice;
        productChoice = getProductNumber(array, sc);
        array[productChoice].setActive(false);
    }
    
    
    public void executeMenuChoice (int menuChoice, Product[] array, Scanner sc) {
        switch (menuChoice) {
            case 1:
                displayInventory(array);
                break;
            case 2:
                addToInventory(array, sc);
                break;
            case 3:
                deductInventory(array, sc);
                break;
            case 4:
                discontinueInventory(array, sc);
                break;
        }
    }
}

