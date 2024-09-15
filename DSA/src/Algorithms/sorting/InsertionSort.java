package Algorithms.sorting;
import java.util.Arrays;
public class InsertionSort {
    public static int[] insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i<n ; i++){
            int index = i;
            int current = arr[i];
            for(int j = i -1; j > -1; j--){
                if (arr[j] > current){
                    arr[j+1] = arr[j];
                    index = j;
                }
            }
            arr[index] = current;
        }
        return arr;
    }
    
    public static void main(String args[]){
        System.out.println(Arrays.toString(insertionSort(new int[]{1,5,9,2,3,4})));
    }
}
