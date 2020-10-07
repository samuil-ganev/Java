package part3;

public class zad2_4 {

	public static void main(String[] args) {
		
		class Main {

			  public static void main(String[] args) {

			    boolean solution = true;

			    int[][] grid = {
			      {, , , , , , , ,},
			      {, , , , , , , ,},
			      {, , , , , , , ,},
			      {, , , , , , , ,},
			      {, , , , , , , ,},
			      {, , , , , , , ,},
			      {, , , , , , , ,},
			      {, , , , , , , ,},
			      {, , , , , , , ,},
			    };

			    //rows

			    for (int i=0;i<9;++i) {

			      boolean[] met = new boolean[9];

			      for (int j=0;j<9;++j) {

			        if (met[grid[i][j]])
			          solution = false; break;

			        met[grid[i][j]] = true;

			      }

			      if (!solution)
			        break;

			    }

			    //columns

			    if (solution) {

			      for (int i=0;i<9;++i) {

			        boolean[] met = new boolean[9];

			        for (int j=0;j<9;++j) {

			          if (met[grid[j][i]])
			            solution = false; break;

			          met[grid[j][i]] = true;

			        }

			        if (!solution)
			          break;

			      }

			    }

			    //boxes

			    if (solution) {

			      int[] ar = {0, 3, 6};
			      
			      for (int i=0;i<3;++i) {

			        for (int j=0;j<3;++j) {

			          boolean[] met = new boolean[9];

			          for (int k1=ar[i];k<ar[i]+3;++k1) {

			            for (int k2=ar[j];k2<ar[j]+3;++k2) {

			              if (met[grid[j][i]])
			                solution = false; break;

			              met[grid[j][i]] = true;

			            }

			          }

			          if (!solution)
			            break;

			        }

			        if (!solution)
			            break;

			      }

			    }

			    if (solution) {
			      System.out.print(1);
			    } else {
			      System.out.print(0);
			    }

			  }

			}

	}

}
