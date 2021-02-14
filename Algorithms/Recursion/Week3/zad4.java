import java.util.Scanner;

class zad4 {

  public static int av(int arr[], int index, int sum) {

    if (index == -1)
      return sum / arr.length;
    return av(arr, index-1, sum+arr[index]);

  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i=0;i<n;++i)
      arr[i] = sc.nextInt();

    System.out.println(av(arr, n-1, 0));

    sc.close();

  }

}
