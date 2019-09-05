package domain;

import java.util.ArrayList;
import java.util.List;

import datasource.BookFinder;
import datasource.BookGateway;

public class Book {
    private String isbn;

    private String author;

    private String title;

    private float price;

    private int copies;

    public Book(String isbn, String author, String title, float price,
            int copy) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.price = price;
        this.setCopies(copy);
    }

    public Book() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public static List<Book> getAllAvailableBooks() {
        BookFinder finder = new BookFinder();
        List<Book> result = new ArrayList<Book>();
        List<BookGateway> booksRecords = finder.findAvailableBooks();

        for (BookGateway br : booksRecords) {
            Book book = new Book(String.valueOf(br.getId()), br.getAuthor(),
                    br.getTitle(), br.getPrice(), br.getQty());
            result.add(book);
        }

        return result;

    }

}
