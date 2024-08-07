package Hell.OOPS.exp3;
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        System.out.println("<---------------------------->\n| DINESH REDDY - URK23CS1263 |\n<---------------------------->\n");

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        System.out.println("Enter the 5 sequnces : ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.next();
        }
        System.out.println("Enter character to be searched : ");
        char s = sc.next().charAt(0);
        sc.close();
        int max = 0;
        
        for (int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr[i].length(); j++){
                if(s == arr[i].charAt(j)){
                    count++;
                }
            }
            if (count>max){
                max = count;
            }
        } 
        System.out.println("Max Count : " + max);
    }

}
