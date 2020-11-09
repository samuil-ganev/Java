import java.util.Random;

public class Main {

    public static void main(String[] args) {
       
        int result = 0;
        int point = 0;
        result = rollDice();
       
        if (checkLoss(result, point)) {
       
            System.out.print("");
       
        } else {
       
            point = result;
            System.out.println("Point is " + point);
        
        }
       
        result = 0;
       
        while(!checkWin(result, point) && !checkLoss(result, point)) {
           
            result = rollDice();
           
        }
       
    }

    public static int rollDice() {
        
        Random rand = new Random();
        int firstDice = rand.nextInt(6) + 1;
        int secondDice = rand.nextInt(6) + 1;
        int sum = firstDice + secondDice;
        System.out.println("You rolled " + firstDice + " + " +secondDice + " = " + sum);
       
        return sum;

    }
    
    public static boolean checkWin (int result, int point) {
       
        boolean win = false;
       
        if (point == 0 && (result == 7 || result == 11)) {
           
            win =  true;   
            System.out.println("You win");
           
        } else if (point != 0 && point == result) {
           
            win = true;
            System.out.println("You win");
           
        }

        return win;

    }
    
    public static boolean checkLoss (int result, int point) {
       
        boolean loss = false;
       
        if (point == 0 && (result == 2 || result == 3 || result == 12)) {
           
            loss = true;
            System.out.println("You lose");
           
        } else if (point !=0 && result == 7) {
           
            loss = true;
            System.out.println("You lose");
           
        }

        return loss;

    }

}
