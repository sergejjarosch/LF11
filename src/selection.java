import java.util.Arrays;
import java.util.OptionalInt;

import static java.util.Arrays.*;

public class selection {
    public static void main(String[] args) {
        int[] sortArr = {12,5,19,3,4,9,34,5,7,4,99,2,1, 20};
        System.out.println("Before: " + Arrays.toString(sortArr));


        for (int i = 0; i <= sortArr.length-1; i++){
            int minValue = i;
            for (int j = i + 1; j <= sortArr.length -1; j++){
                if (sortArr[j] < sortArr[minValue]){
                minValue = j;
                }
            }
            if (i != minValue){
                int temp = sortArr[i];
                sortArr[i] = sortArr[minValue];
                sortArr[minValue] = temp;
                System.out.println("Durchgang:" + i + " - Liste:"  + Arrays.toString(sortArr));
            }

        }
        System.out.println("After:" + Arrays.toString(sortArr));
    }
}
