package Classes;

public class StoryBook extends Book {
    String category;

    public StoryBook() {
        System.out.println(">---------Story Book Details---------<\n");
    }
    StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category){
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void showDetails() {
        System.out.println("ISBN\t\t: " + super.getIsbn());
		System.out.println("Book Title\t: " + super.getBookTitle());
		System.out.println("Author Name\t: " + super.getAuthorName());
		System.out.println("Price\t\t: " + super.getPrice());
		System.out.println("Available Quantity : " + super.getAvailableQuantity());
        System.out.println("Category\t: " + category + "\n");
    }
}
