import java.util.*;

class zad1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Set<Character> set = new LinkedHashSet<Character>();
    String[] text = sc.nextLine().split(" ");

    for (String word : text) {

      for (int i=0;i<word.length();++i) {

        switch(word.charAt(i)) {

          	  case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	            case 'A':
	            case 'E':
	            case 'I':
	            case 'O':	
	            case 'U':
                set.add(word.charAt(i));

        }

      }

    }

    System.out.println(set.size());

  }

}
