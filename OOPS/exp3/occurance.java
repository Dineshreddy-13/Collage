package Hell.OOPS.exp3;

import java.util.ArrayList;
import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
        System.out.println("<---------------------------->\n| DINESH REDDY - URK23CS1263 |\n<---------------------------->\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.nextLine();
        System.out.println("Enter the word to search :");
        String word = sc.nextLine();

        ArrayList<Integer> positions = new ArrayList<>();
        int index = s.indexOf(word);
        while (index != -1) {
            positions.add(index);
            index = s.indexOf(word, index + word.length());
        }

        if (positions.isEmpty()) {
            System.out.println( word + "not found");
        } else {
            System.out.println( word + " : " + positions.size());
            System.out.println("Positions : " + positions);
        }
        sc.close();
    }
}
