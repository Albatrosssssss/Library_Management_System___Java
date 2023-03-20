package Classes;

public class TextBook extends Book {
    int standard;

    public TextBook() {
        System.out.println(">---------Text Book Details---------<\n");
    }
    TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
    public int getStandard() {
        return standard;
    }

    public void showDetails() {
        System.out.println("ISBN\t\t: " + super.getIsbn());
		System.out.println("Book Title\t: " + super.getBookTitle());
		System.out.println("Author Name\t: " + super.getAuthorName());
		System.out.println("Price\t\t: " + super.getPrice());
		System.out.println("Available Quantity : " + super.getAvailableQuantity());
        System.out.println("Standard\t: " + standard + "\n");   
    }
}
