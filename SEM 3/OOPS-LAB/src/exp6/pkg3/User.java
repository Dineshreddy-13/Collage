package exp6.pkg3;


import exp6.pkg1.Books;

public class User {
    private Books books;

    public User(Books books) {
        this.books = books;
    }

    public void searchBook(String book) {
        if (books.searchBook(book)) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void listBooks() {
        System.out.println("Available books: " + books.listBooks());
    }
}

