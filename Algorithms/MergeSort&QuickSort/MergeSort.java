import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static <T extends Comparable<T>> void merge(int leftFirst, int leftLast, int rightFirst, int rightLast, T[] array){
        
        T[] tempArray = Arrays.copyOf(array, array.length);
        
        int index = leftFirst;
        int saveFirst = leftFirst;

        while((leftFirst <= leftLast) && (rightFirst <= rightLast)){
            if(array[leftFirst].compareTo(array[rightFirst]) < 0){
                tempArray[index] = array[leftFirst];
                leftFirst++;
            }else{
                tempArray[index] = array[rightFirst];
                rightFirst++;
            }
            index++;
        }
        while(leftFirst <= leftLast){
            tempArray[index] = array[leftFirst];
            leftFirst++;
            index++;
        }
        while(rightFirst <= rightLast){
            tempArray[index] = array[rightFirst];
            rightFirst++;
            index++;
        }
        for(index = saveFirst; index <= rightLast;index++){
            array[index] = tempArray[index];
        }
    }
    public static <T extends Comparable<T>> void mergeSort(int first, int last,T[] array){
    
        if(first < last) {

            int middle = (first + last) / 2;
            mergeSort(first, middle, array);
            mergeSort(middle+1, last, array);
            merge(first, middle, middle+1, last, array);
        
        }
    
    }
    
    public static <T> void mergeSort(T[] list, Comparator<T super E> comparator) {
		
        if (list.length > 1) {
			
            T[] firstHalf = (T[]) new Object[list.length / 2];
			
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			
            mergeSort(firstHalf, comparator);
			
            int secondHalfLength = list.length - list.length / 2;
			T[] secondHalf = (T[]) new Object[secondHalfLength];
			
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			
            mergeSort(secondHalf, comparator);
			merge(firstHalf, secondHalf, list, comparator);
		}
	}
	
	public static <T> void merge(T[] list1, T[] list2, T[] temp, Comparator<? super T> comparator) {
		
        int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		while (current1 < list1.length && current2 < list2.length) {
			
            if (comparator.compare(list1[current1], list2[current2]) < 0)
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		
        }
		
        while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
	
    }

    public static void main(String[] args){
        
        Integer[] circlearray = new Integer[20];
        
        Random random = new Random();
        
        for (int index = 0; index < 20; index++)
          circlearray[index] = Math.abs(random.nextInt()) % 100;
        
        for(int i=0;i<20;++i)
          System.out.println(circlearray[i]);
        
        mergeSort(0, circlearray.length-1, circlearray);
        
        for(int i: circlearray)
          System.out.println(i);
    
    }

}
