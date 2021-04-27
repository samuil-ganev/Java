import java.util.Arrays;
import java.util.Random;

public class ms {

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
            mergeSort(first,middle,array);
            mergeSort(middle+1,last,array);
            merge(first,middle,middle+1,last,array);
        
        }
    
    }

    public static void main(String[] args){
        Integer[] circlearray = new Integer[20];
        Random rand = new Random();
        for (int index = 0; index < 20; index++)
          circlearray[index] = Math.abs(rand.nextInt()) % 100;
        for(int i=0;i<20;++i)
          System.out.println(circlearray[i]);
        
        mergeSort(0, circlearray.length-1, circlearray);
        for(int i: circlearray)
          System.out.println(i);
    
    }

}
