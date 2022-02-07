package library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Clean Code", 2003, "George Orwell");
        Book bookThree = new Book("Thinking in Java", 2002);
        Book bookTwo = new Book("Clean Architecture", 1930, "Dorothy Sayers", "Robert Eustace");

        Library library = new Library(bookOne, bookTwo, bookThree);

        Iterator<Book> libraryIterator = library.iterator();

        while(libraryIterator.hasNext()){
            System.out.println(libraryIterator.next().getTitle());
        }
    }

}
