import java.util.Scanner;
public class VoteEligilibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("<---------------------------->");
        System.out.println("| DINESH REDDY - URK23CS1263 |");
        System.out.println("<---------------------------->\n");
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        String eligibility;
        eligibility = (age>18) ? "eligible to vote" : "not eligible to vote";
        System.out.println(eligibility);
        input.close();
}
}