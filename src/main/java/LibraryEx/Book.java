package LibraryEx;

import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Getter
@Setter
public class Book implements Borrowable {
    private int ISBN;
    private String title;
    private Genre genre;
    private Author author;
    private boolean isAvailable;
    private Date dueDate;

    public Book(String title, Genre genre) {
        this.ISBN = new Random().nextInt(99999999) + 9999999;
        this.title = title;
        this.genre = genre;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void dueDate() {
        if (dueDate != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println("Срок сдачи книги \"" + title + "\": " + dateFormat.format(dueDate));
        } else {
            System.out.println("Книга \"" + title + "\" не взята в аренду.");
        }
    }

    @Override
    public void rentBook() {
        if (dueDate != null && isAvailable) {
            Date currentDate = new Date();
            long sevenDaysInMillis = 7 * 24 * 60 * 60 * 1000; // 7 days at milliseconds
            dueDate = new Date(currentDate.getTime() + sevenDaysInMillis);
            System.out.println("Книга \"" + title + "\" взята в аренду. Срок сдачи: " + dueDate);
        } else {
            isAvailable = false;
            System.out.println("Книга \"" + title + "\" уже взята в аренду.");
        }
    }

    @Override
    public void returnBook() {
        if (dueDate != null) {
            System.out.println("Книга \"" + title + "\" возвращена.");
            dueDate = null;
            isAvailable = true;
        } else {
            isAvailable = false;
            System.out.println("Книга \"" + title + "\" не была взята в аренду.");
        }
    }

    public void showDetails() {
        String result = """
                ISBN: %d.
                Title: %s.
                Genre: %s.
                """.formatted(ISBN, title, genre.getDescription());
        System.out.println(result);
    }

}
