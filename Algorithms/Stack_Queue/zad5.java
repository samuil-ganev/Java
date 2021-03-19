import java.util.*;

class zad5 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Stack<Double> nums = new Stack<Double>();

    String[] inp = sc.nextLine().split(" ");

    for (String num : inp) {

      switch (num) {

        case "+":
          nums.push(nums.pop() + nums.pop());
          break;
        case "-":
          nums.push(nums.pop() - nums.pop());
          break;
        case "*":
          nums.push(nums.pop() * nums.pop());
          break;
        case "/":
          nums.push(nums.pop() / nums.pop());
          break;
        default:
          nums.push(Double.parseDouble(num));

      }

    }

    System.out.println(nums.toString());

  }

}
