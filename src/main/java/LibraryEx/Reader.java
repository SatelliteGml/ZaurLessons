package LibraryEx;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Setter
@Getter
public class Reader {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public Reader(String name) {
        this.id = new Random().nextInt(10);
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    public void borrowBook(Book book){
        if (book.isAvailable()){
            book.rentBook();
            borrowedBooks.add(book);
            Transaction transaction = new Transaction(new Date(), book, this, "Выдача в аренду");
            Library.addTransaction(transaction);
        }else {
            System.out.println("Book is unavailable");
        }
    }
    public void returnBook(Book book){
        if (borrowedBooks.contains(book)){
            book.returnBook();
            borrowedBooks.remove(book);
            Transaction transaction = new Transaction(new Date(), book, this, "Выдача в аренду");
            Library.addTransaction(transaction);
        }else {
            System.out.println("U dont have this book handle");
        }
    }
    public void displayDetails(){
        System.out.println("Reader id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Borrowed books: ");
        for (Book borrowedBook : borrowedBooks) {
            System.out.println("- " + borrowedBook.getTitle());
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("Borrowed books: ");
        for (Book borrowedBook : borrowedBooks) {
            System.out.println("- " + borrowedBook.getTitle());
        }
    }
}
