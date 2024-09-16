package Algorithms.searching;
public class BinarySearch { // status -> complete
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

    //reccursive binarysearch
    static int recursiveBinarySearch(int arr[],int target,int first,int last){
        int mid =(first + last)/2;
        if (first >= last){
            return -1;
        }
        if (arr[mid] == target){
            return mid;
        }
        if (target < arr[mid])
            return recursiveBinarySearch(arr, target, first, mid-1);
        return recursiveBinarySearch(arr, target, mid+1, last);

    }

    public static void main(String[] args) {
        int index = recursiveBinarySearch(new int[]{1,3,5,7,9,11,13,15,17,19}, 15,0,9);
        int index1 = binarySearch(new int[]{1,3,5,7,9,11,13,15,17,19}, 15);
        System.out.println(index + " " +index1);
    }
    
}
