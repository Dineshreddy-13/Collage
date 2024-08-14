import java.util.Scanner;
public class GradeGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("<---------------------------->\n| DINESH REDDY - URK23CS1263 |\n<---------------------------->\n");

        System.out.println("Enter subjects marks : ");
        float physics = input.nextFloat();
        float chemistry = input.nextFloat();
        float biology = input.nextFloat();
        float mathematics = input.nextFloat();
        float computer = input.nextFloat();
        float percentage = ((physics + chemistry + biology + mathematics + computer)/500)*100;
        System.out.println("percentage : " +percentage);
        if (percentage >= 90)
            System.out.println("Grade A");
        else if (percentage >= 80 && percentage < 90)
            System.out.println("Grade B");
        else if (percentage >= 70 && percentage < 80)
            System.out.println("Grade C");
        else if (percentage >= 60 && percentage < 70)
            System.out.println("Grade D");
        else if (percentage >= 40 && percentage < 60)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
        input.close();
}	
}
