package part3;

public class zad1_4 {

	public static void main(String[] args) {
		
		boolean[][] used = new boolean[4][13];

	    String[] color = {"heart", "diamond", "club", "spade"};
	    String[] value = {"2", "3", "4", "5", "6", "7", "8",
	    "9", "10", "J", "Q", "K", "A"};

	    java.util.Random r = new java.util.Random();
	    int n = 4, x, y;

	    while(n > 0) {

	      x = r.nextInt(4);
	      y = r.nextInt(13);

	      if (used[x][y])
	        continue;

	      used[x][y] = true;
	      System.out.println(value[y] + " " + color[x]);

	      n--;
	      
	    }

	}

}
