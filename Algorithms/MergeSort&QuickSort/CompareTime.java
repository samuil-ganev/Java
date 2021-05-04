import java.io.*;

class CompareTime {

  public static long selectionSort(int[] list) {

    int[] list1 = list.clone();
		
    long start = System.currentTimeMillis();

    for (int i = 0; i < list1.length - 1; i++) {
      
			int currentMin = list1[i];
			int currentMinIndex = i;
			
      for (int j = i + 1; j < list1.length; j++) {
			
      	if (currentMin > list1[j]) {
			
      		currentMin = list1[j];
					currentMinIndex = j;
			
      	}
			
      }

			if (currentMinIndex != i) {
			
      	list1[currentMinIndex] = list1[i];
				list1[i] = currentMin;
			
      }
		
    }

    return System.currentTimeMillis() - start;
	
  }

  public static long quickSort(int[] list) {
	
    int[] list1 = list.clone();

    long start = System.currentTimeMillis();

  	quickSort(list1, 0, list1.length - 1);
	
    return System.currentTimeMillis() - start;

  }

	public static void quickSort(int[] list, int first, int last) {
		
    if (last > first) {
		
    	int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
	    quickSort(list, pivotIndex + 1, last);
	
  	}
	
  }

	public static int partition(int[] list, int first, int last) {
		
    int pivot = list[first];
		int low = first + 1;
		int high = last;
		
    while (high > low) {
      
			while (low <= high && list[low] <= pivot)
				low++;
        
			while (low <= high && list[high] > pivot)
				high--;
        
			if (high > low) {
		
    		int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
		
    	}
		
    }
		
    while (high > first && list[high] >= pivot)
			high--;
      
		if (pivot > list[high]) {
	
  		list[first] = list[high];
			list[high] = pivot;
	
  		return high;
	
  	} else {
	
  		return first;
	
  	}
	
  }

  public static long MergeSort(int[] list) {

    int[] list1 = list.clone();

    long start = System.currentTimeMillis();

    mergeSort(list1);

    return System.currentTimeMillis() - start;

  }

  public static void mergeSort(int[] list) {
		
    if (list.length > 1) {
      
			int[] firstHalf = new int[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);
      
			int secondHalfLength = list.length - list.length / 2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
      
			merge(firstHalf, secondHalf, list);
		
    }
	
  }

	public static void merge(int[] list1, int[] list2, int[] temp) {
	
  	int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
		
    	if (list1[current1] < list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		
    }
		
    while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		
    while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	
  }

  public static long insertionSort(int[] list) {
		
    int[] list1 = list.clone();

    long start = System.currentTimeMillis();

    for (int i = 1; i < list1.length; i++) {
			
      int currentElement = list1[i];
			int k;
			for (k = i - 1; k >= 0 && list1[k] > currentElement; k--)
        list1[k + 1] = list1[k];

			list1[k + 1] = currentElement;
		
    }

    return System.currentTimeMillis() - start;
	
  }

  public static long bubbleSort(int[] list) {
		
    int[] list1 = list.clone();

    long start = System.currentTimeMillis();

    for (int k = 0; k < list1.length - 1; k++) {
		
    	for (int i = 0; i < list1.length - 1 - k; i++) {
		
    		if (list1[i] > list1[i + 1]) {

					int temp = list1[i];
					list1[i] = list1[i + 1];
					list1[i + 1] = temp;

				}

			}

		}

    return System.currentTimeMillis() - start;
    
	}

  public static void main(String[] args) {

    System.out.println("ArraySize | SelectionSort | BubbleSort | MergeSort | QuickSort");

    int sizes[] = {50, 100, 150, 200, 250, 300};
    int[] list = new int[sizes[sizes.length-1]];

    for (int i=0;i<sizes.length;++i) {

      int newEl = sizes[i];
      int start = 0;

      if (i != 0) {
        newEl -= sizes[i-1];
        start = sizes[i] - sizes[i-1];
      }

      for (int j=0;j<newEl;++j)
        list[start+j] = (int)(Math.random() * 10);

      System.out.print(sizes[i] + " | ");
      System.out.print(selectionSort(list) + " | ");
      System.out.print(bubbleSort(list) + " | ");
      System.out.print(MergeSort(list) + " | ");
      System.out.print(quickSort(list) + "\n");

    }

  }

}
