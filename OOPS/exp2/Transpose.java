package Hell.OOPS.exp2;

import java.util.Scanner;
public class Transpose {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        int[][] transpose_arr = new int[3][3];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt(); 
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                transpose_arr[i][j] = arr[j][i]; 
            }
        }
        System.out.println("<-- Transpose -->");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(transpose_arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
