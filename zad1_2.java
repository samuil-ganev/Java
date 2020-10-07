package part3;

public class zad1_2 {

	public static void main(String[] args) {
		
		int[] array = new int[10];

	    for (int i=0;i<10;++i)
	      array[i] = new java.util.Scanner(System.in).nextInt();

	    for (int i=0;i<10;++i) {

	      int r1 = new java.util.Random().nextInt(9);
	      int r2 = new java.util.Random().nextInt(9);

	      int temp = array[r1];
	      array[r1] = array[r2];
	      array[r2] = temp;

	    }

	    for (int el : array)
	      System.out.print(el + " ");

	}

}
