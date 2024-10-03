package exp6.pkg2;
import exp6.pkg1.Books;

public class Admin {
    private Books books;

    public Admin(Books books) {
        this.books = books;
    }

    public void addBook(String book) {
        books.addBook(book);
        System.out.println("Book added: " + book);
    }
}

