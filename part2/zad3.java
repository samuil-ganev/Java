class Main {

  public static void main(String[] args) {

    int num = new java.util.Scanner(System.in).nextInt();

    for (int i=num;i>=0;--i) {

      for (int j=i;j>=1;--j)
        System.out.print(j + " ");

      for (int j=2;j<=i;++j)
        System.out.print(j + " ");

      System.out.println();

    }

  }

}
