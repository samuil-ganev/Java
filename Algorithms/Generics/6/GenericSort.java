import java.util.*;

public class GenericSort extends GenericStack {

	public static void main(String[] args) {
    
    Integer[] integers = { new Integer(2), new Integer(5), new Integer(1), new Integer(10), new Integer(-3) };

		GenericSort<Integer> nums = new GenericSort<Integer>(integers);

    System.out.println(min(nums));
    shuffle(nums);
    printList(nums);
    sort(nums);
    printList(nums);
	
  }

  GenericSort(E[] l) {}

	public static <E extends Comparable<E>> void sort(E[] list) {
		
    E currentMin;
		int currentMinIndex;

		for (int i = 0; i < list.length - 1; i++) {
      
			currentMin = list[i];
			currentMinIndex = i;
			
      for (int j = i + 1; j < list.length; j++) {
			
      	if (currentMin.compareTo(list[j]) > 0) {
					
          currentMin = list[j];
					currentMinIndex = j;
				
        }
			
      }

			if (currentMinIndex != i) {

				list[currentMinIndex] = list[i];
				list[i] = currentMin;

			}

		}

	}

  public static <E> void shuffle(GenericStack<E> list) {

    E[] tempList = (E[])new Object[list.length];

    for (int i=0;i<list.getSize();++i)
      tempList[i] = list[Random.nextInt(list.length)];

    list = tempList;

  }

  public static <E extends Comparable<E>> E min(GenericStack<E> list) {

    E min = list[0];

    for (int i=1;i<list.length;++i) {

      if (min.compareTo(list[i]) > 0)
        min = list[i];

    }

    return min;

  }

	public static void printList(Object[] list) {

		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();

	}

}
