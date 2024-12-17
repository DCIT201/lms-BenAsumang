package org.example;

public class App {
    public static void main(String[] args){
        Library library = new Library();
        Book book1 = new Book("tittle","George Orwell",1949);
        Book book2 = new Book("To kill a Mockingbird","Harper lee",1960);
        library.addBook(book1);
        library.addBook(book2);


        Patron patron1 = new Patron ("Benjamin","LEE1");
        Patron patron2 = new Patron ("Yaw lee","LEE2");

        library.addPatron(patron1);
        library.addPatron(patron2);

        library.displayBooks();
        library.displayPatrons();

    }
}