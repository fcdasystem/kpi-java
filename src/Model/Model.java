package Model;
import java.util.ArrayList;
public class Model {

    static ArrayList<Book> books = new ArrayList<>();

    /**
     * Пошук книги
     *
     * @param id унікальний номер книги
     * @return знайдена кгига
     */

    public static Book getBookById(long id) {
        Book current = null;
        for (Book book : books) {
            if (book.getId() == id) {
                current = book;
                break;
            }
        }

        return current;
    }

    /**
     * Пошук автора
     *
     * @param author
     * @return повертає книгу по автору
     */

    public static Book getBookByAuthor(String author) {
        Book current = null;
        for (Book book : books) {
            if (book.getAuthor() == author) {
                current = book;
                break;
            }
        }

        return current;
    }




}
