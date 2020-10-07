package part3;

public class zad2_1 {

	public static void main(String[] args) {
		
		int row = 0;
	    int[] pr = new int[5];

	    for (int i=0;i<5;++i) {

	      for (int j=0;j<5;++j)
	        pr[i] += new java.util.Scanner(System.in).nextInt();

	      if (i != 0) {

	        if (pr[i] > pr[i-1])
	          row = i;

	      }

	    }

	    System.out.print(row+1);

	}

}
