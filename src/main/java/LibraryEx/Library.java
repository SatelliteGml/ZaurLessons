package LibraryEx;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Library {
    private List<Book> books;
    private List<Reader> readers;
    private List<Author> authors;
    private static List<Transaction> transactions;
    private List<Genre> genres;

    // Конструктор
    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
        this.authors = new ArrayList<>();
        transactions = new ArrayList<>();
        this.genres = new ArrayList<>();
    }

    // Геттеры и сеттеры

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle());
            }
        }
    }

    public void allowReaderToBorrowBook(Reader reader, Book book) {
        reader.borrowBook(book);
    }

    public void allowReaderToReturnBook(Reader reader, Book book) {
        reader.returnBook(book);
    }

    public void displayBooksBorrowedByReader(Reader reader) {
        reader.displayBorrowedBooks();
    }

    public void displayReadersWhoBorrowedBook(Book book) {
        System.out.println("Readers who borrowed " + book.getTitle() + ":");
        for (Reader reader : readers) {
            if (reader.getBorrowedBooks().contains(book)) {
                System.out.println("- " + reader.getName());
            }else {
                System.out.println("error");
            }
        }
    }


    public void displayTransactions() {
        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            transaction.displayDetails();
        }
    }


    public static void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}
