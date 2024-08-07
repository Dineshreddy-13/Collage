package Hell.OOPS.exp3;
import java.util.Scanner;

public class CaseConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        sc.close();
        String s1 = s.toUpperCase();
        System.out.println("Upper Case :  " +s1);
        
    }

}
