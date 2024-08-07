package Hell.OOPS.exp3;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1 = sc.nextLine();
        String s = "";
        
        for(int i=0; i<s1.length(); i++){
            char d = s1.toLowerCase().charAt(i);
            if( d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u' ){
                continue;
            }
            else{
                s += s1.charAt(i);
            }
            
        }
        System.out.println("Output : " + s);
        sc.close();    
    }
    }

