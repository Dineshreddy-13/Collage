package Algorithms.searching;
public class BinarySearch {
    static int binarySearch(int arr[],int target){
        int first = 0,last = arr.length - 1;

        while(first <= last){
            int mid = (first + last)/2;
             if (arr[mid] == target)
             return mid;  
             if (target < arr[mid])
                last = mid - 1;
            else
                first = mid + 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        int index = binarySearch(new int[]{1,3,5,7,9,11,13,15,17,19}, 15);
        System.out.println(index);
    }
    
}
