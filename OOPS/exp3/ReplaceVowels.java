package Hell.OOPS.exp3;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter the char to replace : ");
        char a = sc.nextLine().charAt(0);
        String s = "";
        
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == ' ')
            continue;
            else{
                char d = s1.toLowerCase().charAt(i);
                if( d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u' ){
                    s = s1.replace(s1.charAt(i), a);
                    s1 = s; 
                }  
            }
        }
        System.out.println("Output : " + s);
        sc.close();   
    }
}
