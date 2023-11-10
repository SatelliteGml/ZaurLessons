package LibraryEx;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Author {
    private int id;
    private String name;
    private List<Book> writtenBooks;

    public Author(String name) {
        this.id = new Random().nextInt(10000);
        this.name = name;
        this.writtenBooks = new ArrayList<>();
    }

    public void displayWrittenBooks(Book book) {
        System.out.println("Books written by " + name + " : ");
        for (Book writtenBook : writtenBooks) {
            System.out.println("- " + writtenBook.getTitle());
        }
    }

    public void addWrittenBooks(Book book) {
        writtenBooks.add(book);
    }

    public void removeWrittenBooks(Book book) {
        writtenBooks.remove(book);
    }

    public void displayDetails() {
        System.out.println("Author ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Written Books:");
        for (Book book : writtenBooks) {
            System.out.println("- " + book.getTitle());
        }
    }
}

