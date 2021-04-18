import java.util.Scanner;

class zad {

  public static void sort(int[] array) {

    int temp = 0;

    for (int i=0;i<array.length;++i) {

      for (int j=i+1;j<array.length;++j) {

        if (array[i] > array[j]) {

          temp = array[j];
          array[j] = array[i];
          array[i] = temp;

        }

      }

    }

  }

  public static boolean solution1(int nums[], int result) {

    for (int i=0;i<nums.length;++i) {

      for (int j=0;j<nums.length;++j) {

        if (i != j && nums[i] + nums[j] == result)
          return true;

      }

    }

    return false;

  }

  public static boolean numInArray(int nums[], int num) {

    int leftBorder = 0, rightBorder = nums.length-1;

    while (leftBorder <= rightBorder) {

      int currentNum = nums[(leftBorder + rightBorder) / 2];

      if (currentNum == num)
        return true;

      if (currentNum > num) {
        rightBorder = (leftBorder + rightBorder) / 2 - 1;
      } else {
        leftBorder = (leftBorder + rightBorder) / 2 + 1;
      }

    }

    return false;

  }

  public static boolean solution2(int nums[], int result) {

    sort(nums);

    for (int i=0;i<nums.length;++i) {

      if (numInArray(nums, result - nums[i]))
        return true;

    }

    return false;

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] nums = {1, 8, 3, 7, 5, 9};
    int result = sc.nextInt();

    if (solution2(nums, result))
      System.out.println("Found");

  }

}
