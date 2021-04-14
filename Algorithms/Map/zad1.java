import java.util.*;

class zad1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Map<String, String> map = new HashMap<String, String>();

    while (true) {

      String line = sc.nextLine();

      if (line.equals("break"))
        break;

      String[] words = line.split(" ");
      String city = "", country = "";
      int c = 0;

      for (String word : words) {

        if (c == 0) {
          city = word;
        } else {
          country = word;
        }

        c++;

      }

      map.put(country, city);

    }

    List<String> keysAsArray = new ArrayList<String>(map.keySet());
    Random r = new Random();

    for (int i=0;i<4;++i) {

      String city2 = map.get(keysAsArray.get(r.nextInt(keysAsArray.size())));
      System.out.println(city2 + "?");
      String input = sc.nextLine();

      if (map.get(input).equals(city2))
        System.out.println("Correct");

    }

  }

}
