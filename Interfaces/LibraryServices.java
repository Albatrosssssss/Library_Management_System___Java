package Interfaces;

import Classes.Person;

public interface LibraryServices {
    boolean issueBook(Person p);
    void viewAllIssueBook();
    boolean returnBook(String p);
}
