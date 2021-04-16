import java.util.Scanner;

class zad1 {

  public static void buildFailLinks(String word, int[] failLinks) {

    failLinks[0] = 0;

    for (int i = 1; i < word.length(); i++) {
        
        failLinks[i] = failLinks[i-1];
        
        while (failLinks[i] > 0 && word.charAt(failLinks[i]) != word.charAt(i))    
          failLinks[i] = failLinks[failLinks[i]-1];

        if (word.charAt(failLinks[i]) == word.charAt(i))
          failLinks[i]++;
    
    }
  
  }

  public static int strstr(String text, String word, int[] failLinks) {

    int start = 0, match = 0;
    while (start + word.length() <= text.length()) {

      while (match < word.length() && word.charAt(match) == text.charAt(start + match)) 
        match++;
      
      if (match == word.length())
        return start;

      match = Math.max(0, match - 1);
      start += match - failLinks[match] + 1;

      match = failLinks[match];

    }

    return -1;

  }

  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

    String sentence = sc.nextLine();
    String word = sc.nextLine();

    int[] failLinks = new int[word.length()];

    System.out.println(strstr(sentence, word, failLinks));
  
  }

}
