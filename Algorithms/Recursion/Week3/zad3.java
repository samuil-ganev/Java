import java.util.Scanner;

class zad3 {

  public static int powRecursive(int x, int n, int pr) {
    
    if (n == 0)
      return pr;
        
    return powRecursive(x, n-1, pr * x);

  }


  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();

    System.out.println(powRecursive(x, n, 1));

    sc.close();

  }

}
