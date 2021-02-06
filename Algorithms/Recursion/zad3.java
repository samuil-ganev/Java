import java.util.Scanner;

class zad3 {

  public static int power(int n) {

    int result = 1;

    for (int i=0;i<n;++i)
      result *= 2;

    return result;

  }

  public static int recPower(int n) {

    if (n <= 0)
      return 1;

    return 2 * recPower(n-1);

  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(power(n));
    System.out.println(recPower(n));

    sc.close();

  }

}
