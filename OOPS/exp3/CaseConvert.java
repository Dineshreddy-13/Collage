package Hell.OOPS.exp3;
import java.util.Scanner;

public class CaseConvert {
    public static void main(String[] args) {
        System.out.println("<---------------------------->\n| DINESH REDDY - URK23CS1263 |\n<---------------------------->\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        sc.close();
        String s1 = s.toUpperCase();
        System.out.println("Upper Case :  " +s1);
        
    }

}
