package exp6.pkg1;
import java.util.ArrayList;

public class Books {
    private ArrayList<String> bookList = new ArrayList<>();

    public void addBook(String book) {
        bookList.add(book);
    }

    public boolean searchBook(String book) {
        return bookList.contains(book);
    }

    public ArrayList<String> listBooks() {
        return bookList;
    }
}

