import java.util.Scanner;

class zad2 {

  public static int xMethod(int n, int sum) {

    if (n == 0)
      return sum;
    
    return xMethod(n - 1, sum + n);

  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(xMethod(n, 0));

    sc.close();

  }

}
