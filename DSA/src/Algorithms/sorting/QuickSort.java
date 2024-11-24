package Algorithms.sorting;
import java.util.Arrays;

public class QuickSort {

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    public static void swap(int arr[], int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int arr[],int low, int high){
        if(low < high){
            // System.out.println(Arrays.toString(arr));
            int part = partition(arr, low, high);
            quickSort(arr, low, part-1);
            quickSort(arr, part+1, high);
        }
    }

    public static void main(String args[]){
        int arr[] = new int[]{9,7,10,8};
        System.out.println(Arrays.toString(arr));
    }
}
