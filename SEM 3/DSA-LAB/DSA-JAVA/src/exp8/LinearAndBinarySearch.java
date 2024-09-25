package exp8;
import java.util.Scanner;

public class LinearAndBinarySearch {

    public static int linearSearch(int arr[],int key){
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int arr[],int key) {
        int first = 0;
        int last = arr.length-1;
        while(first<=last) {
            int mid_index = (first + last)/2;

            if (arr[mid_index] == key) 
                return mid_index;
            if (key < arr[mid_index]) 
                last = mid_index - 1;
            else 
                first = mid_index + 1;  
        }
        return -1;
    }

    public static int[] arrayInput(Scanner sc) {
        System.out.print("enter array size : ");
        int arr[] = new int[sc.nextInt()];
        System.out.print("enter elements : ");
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
        
    public static int inputKey(Scanner sc) {
        System.out.print("enter element to be searched : ");
        return sc.nextInt();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println("\nMenu : \n1.LinearSearch\n2.BinarySearch\n3.exit");
            System.out.print("choose search : ");
            switch(sc.nextInt()) {
                case 1 -> System.out.println("--> index : " + linearSearch(arrayInput(sc),inputKey(sc)));
                case 2 -> System.out.println("--> index : " + binarySearch(arrayInput(sc),inputKey(sc)));
                case 3 -> loop = false;
                default -> System.out.println("invalid");
        }
        }while(loop);
        sc.close();
    }
}