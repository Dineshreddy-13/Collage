import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("<---------------------------->");
		System.out.println("| DINESH REDDY - URK23CS1263 |");
		System.out.println("<---------------------------->\n");
        int choice;
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        do {
            // Display menu options
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check if the number is a Buzz number");
            System.out.println("2. Check if the number is even or odd");
            System.out.println("3. Check if the number is positive or negative");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: \n");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    if (isBuzzNumber(number)) {
                        System.out.println(number + " is a Buzz number.");
                    } else {
                        System.out.println(number + " is not a Buzz number.");
                    }
                    break;
                case 2:
                    if (number % 2 == 0) {
                        System.out.println(number + " is even.");
                    } else {
                        System.out.println(number + " is odd.");
                    }
                    break;
                case 3:
                    if (number > 0) {
                        System.out.println(number + " is positive.");
                    } else if (number < 0) {
                        System.out.println(number + " is negative.");
                    } else {
                        System.out.println(number + " is neither positive nor negative.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 4);
        
        scanner.close();
    }

    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    
}
