package Algorithms.sorting;
import java.util.Arrays;
public class BubbleSort {
// better bubble sort
    static int[] bubbleSort(int arr[]){
        int n = arr.length - 1;
        for (int i = 0; i<n; i++ ){
            boolean swapped = false; 
            for (int j = 0; j<n-i;j++ ){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{64, 34, 25, 12, 22, 11, 90, 5})));
    }
    

}
