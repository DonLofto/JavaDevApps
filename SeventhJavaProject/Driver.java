import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Driver {
        public static void main(String [] args) throws IOException {
            Library library = new Library();

            Book Book1 = new Book("The Hobbit", "J.R.R. Tolkien");
            Book Book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien");
            Book Book3 = new Book("The Silmarillion", "J.R.R. Tolkien");
            Book Book4 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien");
            Book Book5 = new Book("The Two Towers", "J.R.R. Tolkien");
            Book Book6 = new Book("The Return of the King", "J.R.R. Tolkien");

            library.addBook(Book1);
            library.addBook(Book2);
            library.addBook(Book3);
            library.addBook(Book4);
            library.addBook(Book5);
            library.addBook(Book6);

            // this implements writeToFile function to write the ArrayList to myFile.txt
            List<Book> books = library.getBooks();
            writeToFile(books);


            library.removeBook(Book6);
            // this implements readFromFile function to read the ArrayList from myFile.txt
            List<Book> list= new ArrayList<>();
            readFromFile(list);

            // This serialises the ArrayList and writes it to myFile
            serialise(books);
            // this deserialises the ArrayList and reads it from myFile
            deserialise(list);


        }


    /**
     *
     * @param list
     * @throws IOException
     */
    public static void writeToFile(List<Book> list) throws IOException {
        PrintWriter printWriter = new PrintWriter("Library.txt");
        for (Book book: list) {
            printWriter.println(book.toString());
        }
            printWriter.close();
            System.out.println("Successfully wrote to the file.");
        }

        /**
         * this method reads the ArrayList from myFile.txt
         * @param list
         * @throws IOException
         */
    public static void readFromFile(List<Book> list) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Library.txt"));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }

    /**
     * this method serialises the ArrayList and writes it to myFile
     * @param list
     * @throws IOException
     */
    public static void serialise(List<Book> list) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Library.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Successfully serialised");
    }

    /**
     * this method deserialises the ArrayList and reads it from myFile
     * @param list
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void deserialise(List<Book> list) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("Library.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try {
            list = (List<Book>) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        objectInputStream.close();
        fileInputStream.close();
        System.out.println("Successfully deserialised");
        for (Book book: list) {
            System.out.println(book.toString());
        }

        }
    }







