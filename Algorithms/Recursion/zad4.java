import java.util.Scanner;

class zad4 {

  public static int power(double x, int n) {

    int result = 1;

    for (int i=0;i<n;++i)
      result *= x;

    return result;

  }

  public static int recPower(double x, int n) {

    if (n <= 0)
      return 1;

    return x * recPower(n-1);

  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    int n = sc.nextInt();

    System.out.println(power(x, n));
    System.out.println(recPower(x, n));

    sc.close();

  }

}
