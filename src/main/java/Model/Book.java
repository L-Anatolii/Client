package Model;

import java.io.Serializable;
import java.util.Date;

public class Book  implements Serializable {

    private long books_id;
    private String book_title;
    private int book_price;
    private int book_pages;
    private Date date_of_publication;


    public Book(long books_id, String book_title, int book_price, int book_pages, Date date_of_publication) {
        this.books_id = books_id;
        this.book_title = book_title;
        this.book_price = book_price;
        this.book_pages = book_pages;
        this.date_of_publication = date_of_publication;
    }

    public Book() {
    }

    public long getBooks_id() {
        return books_id;
    }

    public void setBooks_id(long books_id) {
        this.books_id = books_id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public int getBook_price() {
        return book_price;
    }

    public void setBook_price(int book_price) {
        this.book_price = book_price;
    }

    public int getBook_pages() {
        return book_pages;
    }

    public void setBook_pages(int book_pages) {
        this.book_pages = book_pages;
    }

    public Date getDate_of_publication() {
        return date_of_publication;
    }

    public void setDate_of_publication(Date date_of_publication) {
        this.date_of_publication = date_of_publication;
    }

}
