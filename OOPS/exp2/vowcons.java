package Hell.OOPS.exp2;
public class vowcons {
   public static void main(String[] args) {
       String inp_String = "Dinesh";
       int vow = 0;
       int con = 0;
       inp_String = inp_String.toLowerCase();
       for (char c : inp_String.toCharArray()) {
           if (c >= 'a' && c <= 'z') {
               if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vow++;
               } else {
                con++;
               }
           }
       }
       System.out.println("Number of vowels: " + vow);
       System.out.println("Number of consonants: " + con);
   }
}