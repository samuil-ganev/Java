package part3;

public class zad1_1 {

	public static void main(String[] args) {
		
		int[] array = new int[20];

	    for (int i=0;i<20;++i)
	      array[i] = new java.util.Random().nextInt(99);

	    for (int el : array)
	      System.out.print(el + " ");

	}

}
