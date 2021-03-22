import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;

class readSort {

  public static void main(String[] args) {

    String fileName = "read.txt";
    File file = new File(fileName);
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);

    String line;
    LinkedList<String> words = new LinkedList<String> ();

    while ((line = br.readLine()) != null) 
      words.add(line);
    
    Collections.sort(words);

    Iterator it = words.iterator();

    while (it.hasNext())
      System.out.println(it.next());

  }

}
