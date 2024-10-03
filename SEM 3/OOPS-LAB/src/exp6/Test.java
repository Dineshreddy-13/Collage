package exp6;

import exp6.pkg1.Books;
import exp6.pkg2.Admin;
import exp6.pkg3.User;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Books books = new Books();
        Admin admin = new Admin(books);
        User user = new User(books);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book\n2. Search Book\n3. List Books\n4. Exit");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String bookName = sc.nextLine();
                    admin.addBook(bookName);
                    break;
                case 2:
                    System.out.print("Enter book name to search: ");
                    String searchName = sc.nextLine();
                    user.searchBook(searchName);
                    break;
                case 3:
                    user.listBooks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}

