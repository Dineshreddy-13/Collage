package Algorithms.sorting;
import java.util.Arrays;
public class SelectionSort { // status -> complete

    // selection sort by swapping 
    static int[] fun(int[] arr){
        int minindex;
        for(int i = 0; i<arr.length; i++){
            minindex = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[j]< arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
        return arr;
    }

    // selection sort by shifting
    static int[] fun1(int arr[]){
        for (int i = 0; i<arr.length - 1; i++ ){
            int minindex = i;
            for (int j = i+1; j<arr.length; j++ ){
                if (arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            int minvalue = arr[minindex];
            for (int k = minindex; k>i; k--){
                arr[k] = arr[k-1];
            }
            arr[i] = minvalue;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = fun1(new int[]{1,9,4,2,7,5,3,6});
        System.out.println(Arrays.toString(arr)); 
    }
    
}
