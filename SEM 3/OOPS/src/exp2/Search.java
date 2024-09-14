package exp2;
import java.util.Scanner;

public class Search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to be searched : ");
        int element = sc.nextInt();
        boolean found = false;
        for(int i=0; i<size; i++){
            if (arr[i] == element){
                found = true;
                break;
            }
        }
        if (found)
        System.out.println("element found");
        else
        System.out.println("element not found");
        sc.close();
    }
}
