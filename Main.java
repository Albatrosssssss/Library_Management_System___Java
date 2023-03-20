import Classes.*;
import FileIO.FileReadWrite;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Management management = new Management();
        Services services = new Services();
        Scanner sc = new Scanner(System.in);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-----------------------------------------------------");
        System.out.println("\t\tWelcome to XYZ Library");
        System.out.println("-----------------------------------------------------\n");

        boolean repeat = true;
        while(repeat) {
            System.out.println("------> What do you want to do? <------");
            System.out.println("\t1. Library Management");
            System.out.println("\t2. Library Services");
            System.out.println("\t3. History");
            System.out.println("\t4. Exit\n");
            System.out.print("Your choice : ");
            int choice = sc.nextInt(); String input; int intInput;

            switch(choice) {
                case 1:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("\tYou choose Library Management");
                    System.out.println("-----------------------------------------------------\n");
                    System.out.println("You have the following options:");
                    System.out.println("\t1. Add a new book");
                    System.out.println("\t2. Remove a existing book");
                    System.out.println("\t3. Search a book");
                    System.out.println("\t4. Show all books");
                    System.out.println("\t5. Go Back\n");

                    System.out.print("Your Option: ");
                    int option1 = sc.nextInt();
                    switch(option1) {
                        case 1:
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tYou choose Add a new book");
                            System.out.println("-----------------------------------------------------\n");
                            System.out.println("1. Add a story book");
                            System.out.println("2. Add a text book");
                            option1 = sc.nextInt();
                            if(option1 == 1) {
                                StoryBook sbook1 = new StoryBook();
                                System.out.print("Enter Story Book ISBN No. : ");
                                input = sc.next();
                                sbook1.setIsbn(input);
                                System.out.print("Enter Story Book Title : ");
                                input = bfr.readLine();
                                sbook1.setBookTitle(input);
                                System.out.print("Enter Story Book Author's Name : ");
                                input = bfr.readLine();
                                sbook1.setAuthorName(input);
                                System.out.print("Enter Story Book Price : ");
                                intInput = sc.nextInt();
                                sbook1.setPrice(intInput);
                                System.out.print("Enter Story Book category : ");
                                input = sc.next();
                                sbook1.setCategory(input);
                                System.out.print("Enter Story Book quantity : ");
                                intInput = sc.nextInt();
                                sbook1.setAvailableQuantity(intInput);
                                if(management.addNewBook(sbook1)) { System.out.println("Story book [isbn : " + sbook1.getIsbn() + "] inserted successfully"); }
                                else { System.out.println("error : Story book [isbn : " + sbook1.getIsbn() + "] was not inserted"); }
                            }else if(option1 == 2) {
                                TextBook tbook1 = new TextBook();
                                System.out.print("Enter Story Book ISBN No. : ");
                                input = sc.next();
                                tbook1.setIsbn(input);
                                System.out.print("Enter Story Book Title : ");
                                input = bfr.readLine();
                                tbook1.setBookTitle(input);
                                System.out.print("Enter Story Book Author's Name : ");
                                input = bfr.readLine();
                                tbook1.setAuthorName(input);
                                System.out.print("Enter Story Book Price : ");
                                intInput = sc.nextInt();
                                tbook1.setPrice(intInput);
                                System.out.print("Enter Story Book standard : ");
                                intInput = sc.nextInt();
                                tbook1.setStandard(intInput);
                                System.out.print("Enter Story Book quantity : ");
                                intInput = sc.nextInt();
                                tbook1.setAvailableQuantity(intInput);
                                if(management.addNewBook(tbook1)) { System.out.println("Story book [isbn : " + tbook1.getIsbn() + "] inserted successfully"); }
                                else { System.out.println("error : Story book [isbn : " + tbook1.getIsbn() + "] was not inserted"); }
                            }else {
                                System.out.println("\tINVALID CHOICE!!");
                            }
          
                            break;
                        case 2:
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tYou choose Remove a existing book");
                            System.out.println("-----------------------------------------------------\n");
                            System.out.print("Enter Story Book ISBN No. : ");
                            input = sc.next();
                            Book b = management.searchBook(input);
                            if(b == null) {
                                System.out.println("Book not found");
                            }else {
                                if(management.removeBook(b)) { System.out.println("Story book [isbn : " + b.getIsbn() + "] DELETED successfully"); }
                                else { System.out.println("error : Story book [isbn : " + b.getIsbn() + "] can not be DELETED"); }
                            }
                            break;
                        case 3:
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tYou choose Search a book");
                            System.out.println("-----------------------------------------------------\n");
                            System.out.print("Enter Story Book ISBN No. : ");
                            input = sc.next();
                            Book b2 = management.searchBook(input);
                            if(b2 == null) {
                                System.out.println("Book not found");
                            }else {
                                if(b2 != null) { System.out.println("Text book [isbn : " + b2.getIsbn() + "] Found"); b2.showDetails();}
                            }
                            break;
                        case 4:
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tYou choose Show All Books");
                            System.out.println("-----------------------------------------------------\n");
                            management.viewAllBooks();
                            break;
                        case 5:
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tYou choose Go Back");
                            System.out.println("-----------------------------------------------------\n");
                            break;
                        default:
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tINVALID CHOICE!!");
                            System.out.println("-----------------------------------------------------\n");
                            break;
                        }
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("\tYou choose Library Services");
                    System.out.println("-----------------------------------------------------\n");
                    System.out.println("You have the following options:");
                    System.out.println("\t1. Issue a book");
                    System.out.println("\t2. Return a book");
                    System.out.println("\t3. View all issued book");
                    System.out.println("\t4. Go Back\n");
                    System.out.print("Your Option: ");
                    int option2 = sc.nextInt();
                    switch(option2) {
                        case 1:
                            Person p = new Person();
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tYou choose Issue a book");
                            System.out.println("-----------------------------------------------------\n");
                            System.out.print("Enter Person Name : ");
                            input = bfr.readLine();
                            p.setName(input);
                            System.out.print("Enter Person ID : ");
                            input = sc.next();
                            p.setId(input);
                            System.out.print("Enter book isbn : ");
                            input = sc.next();
                            p.setIsbn(input);
                            if(management.searchBook(input) == null) {
                                System.out.println("Book not found");
                                break;
                            }
                            System.out.print("Enter Issue Date : ");
                            input = sc.next();
                            p.setIssueDate(input);
                            System.out.print("Enter Return Date : ");
                            input = sc.next();
                            p.setRetrunDate(input);
                            if(services.issueBook(p)) {
                                System.out.println("Book issued successfully");
                                FileReadWrite f = new FileReadWrite();
                                f.writeInFile("\nName : " + p.getName() + " ID : " + p.getId() + " Issued Book ISBN : " + p.getIsbn() + " Issued Date : " + p.getIssueDate() + " Return Date : " + p.getRetrunDate());
                            }else {
                                System.out.println("Book not issued");
                            }
                            break;
                        case 2:
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tYou choose Return a book");
                            System.out.println("-----------------------------------------------------\n");
                            System.out.print("Enter Person ID : ");
                            input = sc.next();
                            if(services.returnBook(input)) {
                                System.out.println("Book returned successfully");
                                FileReadWrite ff = new FileReadWrite();
                                ff.writeInFile("\nID : " + input + " return the book");
                            }else {
                                System.out.println("Book not returned");
                            }
                            break;
                        case 3:
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tYou choose View all issued book");
                            System.out.println("-----------------------------------------------------\n");
                            services.viewAllIssueBook();
                            break;
                        case 4:
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tYou choose Go Back");
                            System.out.println("-----------------------------------------------------\n");
                            break;
                        default:
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\tINVALID CHOICE!!");
                            System.out.println("-----------------------------------------------------\n");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("\tYou choose History");
                    System.out.println("-----------------------------------------------------\n");
                    FileReadWrite fileReadWrite = new FileReadWrite();
                    fileReadWrite.readFromFile();
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("\tYou choose Exit");
                    System.out.println("-----------------------------------------------------\n");
                    repeat = false;
                    break;
                default:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("\tINVALID CHOICE!!");
                    System.out.println("-----------------------------------------------------\n");
                    break;
            }
        }
        sc.close();
    }
}