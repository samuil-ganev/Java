package part3;

public class zad2_2 {

	public static void main(String[] args) {

		int[][] tensor = new int[new java.util.Random().nextInt(5) + 1][new java.util.Random().nextInt(5) + 1];

	    for (int i=0;i<tensor.length;++i) {

	      for (int j=0;j<tensor[0].length;++j)
	        tensor[i][j] = new java.util.Random().nextInt(5);

	    }

	    System.out.println("Tensor before:");

	    for (int[] el : tensor) {

	      for (int e : el)
	        System.out.print(e + " ");

	      System.out.println();

	    }

	    System.out.println("Tensor after:");

	    int[][] tensorT = new int[tensor[0].length][tensor.length];

	    for (int i=0;i<tensor.length;++i) {

	      for (int j=0;j<tensor[0].length;++j)
	        tensorT[j][i] = tensor[i][j];

	    }

	    for (int[] el : tensorT) {

	      for (int e : el)
	        System.out.print(e + " ");

	      System.out.println();

	    }

	}

}
