import java.util.*;

class zad2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String line = sc.nextLine();
    Stack<Character> q = new Stack<Character>();

    for (int i=0;i<line.length();++i) {

      char ch = line.charAt(i);

      if (ch == '(' || ch == '{' || ch == '[') {
        q.push(ch);
      } else if (ch == ')' || ch == '}' || ch == ']') {
        
        if (ch == ')' && q.peek() == '(') {
          q.pop(); 
        } else if (ch == '}' && q.peek() == '{') {
          q.pop();
        } else if (ch == ']' && q.peek() == '[') {
          q.pop();
        } else {
          break;
        }
          
      }

    }

    if (q.isEmpty()) {
      System.out.println("Empty");
    } else {
      System.out.println("Error");
    }
    
  }

}
