package Classes;

public abstract class Book {
    private String isbn, bookTitle, authorName;
    private double price;
    private int availableQuantity;

    Book(){
        System.out.println("----------Book Details----------\n");
    }
    Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity){
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public String getAuthorName() {
        return authorName;
    }
    public double getPrice() {
        return price;
    }
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    public void addQuantity(int amount) {
        if(amount>0) {
            availableQuantity += amount;
        }
        else {
            System.out.println("Invalid");
        }
    }
    public void sellQuantity(int amount) {
        if(amount>0 && amount<=availableQuantity) {
            availableQuantity -= amount;
        }
        else {
            System.out.println("Invalid");
        }
    }
    public abstract void showDetails();
}