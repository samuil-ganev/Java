package part3;

public class zad1_3 {

	public static void main(String[] args) {
		
		int[] array = new int[10];

	    for (int i=0;i<10;++i)
	      array[i] = new java.util.Scanner(System.in).nextInt();

	    int t = array[0];

	    array[0] = array[array.length - 1];

	    for (int i=9;i>0;--i)
	      array[i] = array[i-1];

	    array[1] = t;

	    for (int el : array)
	      System.out.print(el + " ");

	}

}
