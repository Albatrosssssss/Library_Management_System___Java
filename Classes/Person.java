package Classes;

public class Person {
    String name, id, issueDate, retrunDate, isbn;
    public Person(){}
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    public void setRetrunDate(String retrunDate) {
        this.retrunDate = retrunDate;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getId() {
        return id;
    }
    public String getIssueDate() {
        return issueDate;
    }
    public String getName() {
        return name;
    }
    public String getRetrunDate() {
        return retrunDate;
    }
    public String getIsbn() {
        return isbn;
    }
    void showDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Issue Date : " + issueDate);
        System.out.println("return Date : " + retrunDate);
        System.out.println("ISBN : " + isbn);
    }
}
