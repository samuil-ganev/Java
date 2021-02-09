import java.util.Scanner;

class even_odd {

  public static boolean isEven(int n) {

    if (n == 1)
      return false;
    else if (n == 0)
      return true;
    else
      return isEven(n-2);

  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (isEven(n)) System.out.print(1); else System.out.print(2);

    sc.close();

  }

}
