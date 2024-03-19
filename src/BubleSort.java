import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {

        int[] arraySort = {9, 10, 8, 4, 7, 11, 2, 6, 5, 3, 1, 0};

        for(int i = 0; i <= arraySort.length; i++){
            for (int j = 0; j < arraySort.length -i -1 ; j++){
                if (arraySort[j] > arraySort[j + 1]){
                    int tmp = arraySort[j];
                    arraySort[j] = arraySort[j + 1];
                    arraySort[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < arraySort.length; i++){
            System.out.print(arraySort[i] + " ");
        }
    }
}
