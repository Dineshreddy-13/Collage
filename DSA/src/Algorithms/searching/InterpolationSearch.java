package Algorithms.searching;

public class InterpolationSearch {

    public static int interpolationSearch(int arr[], int first, int last, int key){
        if (first <= last && key>=arr[first] && key<=arr[last]){
            int pos = last + (((last - first) / (arr[last] - arr[first])) * (key - arr[last]));

            if (arr[pos] == key){
                return pos;
            }
            else if(arr[pos] < key)
                return interpolationSearch(arr, pos+1, last, key);
            else if(arr[pos] > key)
                return interpolationSearch(arr, pos-1, last, key);
        }
        return -1;
    }

    public static void main(String args[]){
        int x = interpolationSearch(new int[]{1,2,3,4,5,6,7}, 0, 6, 9);
        System.out.println(x);
    }

}
