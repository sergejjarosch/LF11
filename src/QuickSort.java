import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] sortArr = {12,5,9,3,4,9,8,5,7,4,3,2,1};
        System.out.println(("Before: ") + Arrays.toString(sortArr));

        quicksort(sortArr, 0, sortArr.length -1);

        System.out.println(("After: ") + Arrays.toString(sortArr));
    }


    public static void quicksort(int[] array, int low, int high){
        if (low >= high){
            return;
        }
        int pivot = array[high];
        int leftPointer = low;
        int rightPointer = high;

        while (leftPointer < rightPointer){

            while ( array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, high);
        quicksort(array, low, leftPointer -1);
        quicksort(array, leftPointer + 1, high);
    }
    // Triangle swap - as with Bubblesort
    public static void swap(int[] array, int index_1, int index_2){
        int temp = array[index_1];
        array[index_1] = array[index_2];
        array[index_2] = temp;
    }
}
