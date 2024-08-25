package exp2;
import java.util.Scanner;

public class Common {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr1[],arr2[];

        System.out.println("enter array 1 size");
        int arr1_size = sc.nextInt();
        arr1 = new int[arr1_size];
        System.out.println("enter array elements");
        for(int i=0; i<arr1.length; i++){
            arr1[i]= sc.nextInt();
        }

        System.out.println("enter array 2 size");
        int arr2_size = sc.nextInt();
        arr2 = new int[arr2_size];
        System.out.println("enter array elements");
        for(int i=0; i<arr2.length; i++){
            arr2[i]= sc.nextInt();
        }
        System.out.println(" <-- common elements -->");
         for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + ", ");
                }
            }
         }
         sc.close();
    }
}
