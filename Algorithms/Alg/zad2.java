import java.util.Scanner;

class zad2 {

  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

    String word = sc.nextLine();
    final int wordLength = word.length();

    int[] ascii = new int[wordLength];
    int[] lis = new int[wordLength];

    for (int i=0;i<wordLength;++i) {
      ascii[i] = (int) word.charAt(i);
      lis[i] = 1;
    }

    for (int i=1;i<wordLength;++i) {

      for (int j=0;j<i;++j) {

        if (ascii[i] > ascii[j] && lis[i] < lis[j] + 1)
          lis[i] += 1;

      }

    }

    int tempMax = 0;

    for (int i=0;i<wordLength;++i) {

      if (lis[i] > tempMax) {

        tempMax = lis[i];
        System.out.print(word.charAt(i));

      }

    }
  
  }

}
