//import java.util.List;
import java.util.ArrayList;
import java.util.List;


public class Library {
    private String name;
    List<Book> books = new ArrayList<>();


    public Library() {

    }

    public String getName() {
        return name;
        }


    public ArrayList<Book> getBooks() {
        return (ArrayList<Book>) books;

    }

    public void addBook(Book book) {
        books.add(book);


    }

    public void removeBook(Book book) {
        books.remove(book);

    }

    public String toString() {
        return "Library [name=" + name + "]";
    }



}
