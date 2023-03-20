package Classes;

import Interfaces.ManagementInterface;

public class Management implements ManagementInterface {
    private Book books[];

    public Management() {
        books = new Book[100];
    }
    Management(String name) {
        this();
    }
    @Override
    public boolean addNewBook(Book book) {
        boolean flag = false;
        for(int i=0; i<books.length; i++) {
            if(books[i] == null) {
                books[i] = book;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public boolean removeBook(Book book) {
        boolean flag = false;
        for(int i=0; i<books.length; i++) {
            if(books[i] == book) {
                books[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    @Override
    public boolean viewAllBooks() {
        for(int i=0; i<books.length; i++) {
            if(books[i] != null) {
                books[i].showDetails();
                System.out.println("--------------------------------------");
            }
        }
        return false;
    }
    @Override
    public Book searchBook(String isbn) {
        Book flag = null;
        for(int i=0; i<books.length; i++) {
            if(books[i] != null && books[i].getIsbn().equals(isbn)) {
                flag = books[i];
                break;
            }
        }
        return flag;
    }
}
