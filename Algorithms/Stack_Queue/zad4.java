import java.util.*;

class zad4 {

  public static void main(String[] args) {
    PriorityQueue<String> q1 = new PriorityQueue<String>();
    PriorityQueue<String> q2 = new PriorityQueue<String>();
    reset(q1, q2);

    //Union
    PriorityQueue<String> union = q2;
    for (String name1 : q1) {
      boolean met = false;
      for (String name2 : union) {
        if (name1.equals(name2))
          met = true;
      }
      if (!met)
        union.offer(name1);
    }

    System.out.println(union.toString());
    reset(q1, q2);
    //Intersection
    PriorityQueue<String> intersection = new PriorityQueue<String>();
    for (String name1 : q1) {
      boolean met = false;
      for (String name2 : q2) {
        if (name1.equals(name2))
          met = true;
      }
      if (met)
        intersection.offer(name1);
    }

    System.out.println(intersection.toString());
    reset(q1, q2);
    //Difference
    PriorityQueue<String> difference = new PriorityQueue<String>();
    for (String name1 : union) {
      boolean met = false;
      for (String name2 : intersection) {
        if (name1.equals(name2))
          met = true;
      }
      if (!met)
        difference.offer(name1);
    }

    System.out.println(difference.toString());

  }
  public static void reset(PriorityQueue<String> q1,PriorityQueue<String> q2){
    q1.clear();
    q2.clear();
    q1.offer("George");
    q1.offer("Jim");
    q1.offer("Jone");
    q1.offer("Blake");
    q1.offer("Kevin");
    q1.offer("Michael");

    q2.offer("George");
    q2.offer("Katie");
    q2.offer("Kevin");
    q2.offer("Michelle");
    q2.offer("Ryan");
  }

}
