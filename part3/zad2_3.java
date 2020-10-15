package part3;

public class zad2_3 {

	public static void main(String[] args) {
		
	    int[] results = new int[10];
	    char[] ans = new char[10];
	    
	    for (int i=0;i<10;++i)
	      ans[i] = (char)(new java.util.Random().nextInt(5) + 65);

	    for (int i=0;i<8;++i) {

	      for (int j=0;j<10;++j) {
	        
	        if (ans[i] == (char)(new java.util.Random().nextInt(5) + 65))
	          results[i] += 1;

	      }

	    }

	    for (int el : results)
	      System.out.println(el);

	}

}
