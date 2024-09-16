package Algorithms.searching;
public class LinearSearch { // status -> complete

    static int linearSearch(int[] arr,int target){
        for (int i= 0; i<arr.length; i++){
            if (arr[i] == target)
            return i;  
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int index = linearSearch(new int[]{1,7,2,5,3,9,6,4}, 1);
        System.out.println(index);  
    }
}