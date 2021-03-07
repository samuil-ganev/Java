import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    GenericStack<String> words = new GenericStack<String>();

    for (int i=0;i<5;++i)
      words.push(sc.nextLine());

    while (words.isEmpty())
      System.out.println(words.pop());

  }

}
