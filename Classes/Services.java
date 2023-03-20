package Classes;

import Interfaces.LibraryServices;

public class Services implements LibraryServices {
    Person[] persons;
    public Services() {
        persons = new Person[100];
    }

    @Override
    public boolean issueBook(Person p) {
        boolean flag = false;
        for(int i=0; i<persons.length; i++) {
            if(persons[i] == null) {
                persons[i] = p;
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void viewAllIssueBook() {
        for(int i=0; i<persons.length; i++) {
            if(persons[i] != null) {
                persons[i].showDetails();
                System.out.println("--------------------------------------");
            }
        }
    }

    @Override
    public boolean returnBook(String pid) {
        boolean flag = false;
        for(int i=0; i<persons.length; i++) {
            if(persons[i].getId().equals(pid)) {
                persons[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }
    
}
