import java.util.Scanner;

class zad1 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int result = 0;

    /*for (int i=1;i<=n;++i)
      result += i;
    */

    //Better:
    result = n * (n+1) / 2;

    System.out.print(result);

    sc.close();
  
  }

}
