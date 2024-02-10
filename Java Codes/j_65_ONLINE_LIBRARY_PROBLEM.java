package com.company;

class Library{
    String[] books;
    int no_of_books;
    Library(){  //constructor
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }

    void  showAvailableBook(){
        System.out.println("Available books are: ");
        for(String book : this.books){
            if(book==null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist.");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class j_65_ONLINE_LIBRARY_PROBLEM {
    public static void main(String[] args) {
        // You have to implement a library using java class library
        // Method: Add book, Issue book, Return book, Show available book
        // Properties: Array to store the available books, Array to store the issued books
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithm");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBook();
        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBook();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBook();
    }
}
