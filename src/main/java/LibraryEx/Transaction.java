package LibraryEx;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Random;

@Setter
@Getter
public class Transaction {
    private int id;
    private Date date;
    private Book book;
    private Reader reader;
    private String transactionType;

    public Transaction(Date date, Book book, Reader reader, String transactionType) {
        this.id = new Random().nextInt(1111);
        this.date = date;
        this.book = book;
        this.reader = reader;
        this.transactionType = transactionType;
    }
    public void displayDetails() {
        System.out.println("Transaction ID: " + id);
        System.out.println("Date: " + date);
        System.out.println("Book: " + book.getTitle());
        System.out.println("Reader: " + (reader != null ? reader.getName() : "N/A"));
        System.out.println("Transaction Type: " + transactionType);
    }
}
