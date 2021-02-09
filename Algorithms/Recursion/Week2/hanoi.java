import java.util.Scanner;

class Main {

  public static int hanoi(int n, int st, int end) {

    int result = 1;

    if (n == 1) {
      System.out.println(st + " -> " + end);
      return 1; }

    result += hanoi(n - 1, st, 6 - (st + end));
    System.out.println(st + " -> " + end);
    result += hanoi(n - 1, 6 - (st + end), end);

    return result;

  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(hanoi(n, 1, 3));

    sc.close();

  }

}
