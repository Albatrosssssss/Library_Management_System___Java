package Interfaces;

import Classes.Book;

public interface ManagementInterface {
    boolean addNewBook(Book b);
    boolean removeBook(Book b);
    Book searchBook(String isbn);
    boolean viewAllBooks();
}
