package LibraryEx;

public class RunnerLib {
    public static void main(String[] args) {

        Author a1 = new Author("A1");
        Author a2 = new Author("A2");
        Author a3 = new Author("A3");

        Book b1 = new Book("b1",Genre.NOVEL);
        Book b2 = new Book("b2",Genre.NOVEL);
        Book b3 = new Book("b3",Genre.POETRY);
        Book b4 = new Book("b4",Genre.HISTORICAL);
        Book b5 = new Book("b5",Genre.DETECTIVE);
        Book b6 = new Book("b6",Genre.DETECTIVE);
        Book b7 = new Book("b7",Genre.DETECTIVE);
        Book b8 = new Book("b8",Genre.POETRY);
        Book b9 = new Book("b9",Genre.SCIENCE_FICTION);

        Reader r1 = new Reader("Arina");
        Reader r2 = new Reader("Sophia");
        Reader r3 = new Reader("Alla");
        Reader r4 = new Reader("Artur");

        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);
        library.addBook(b6);
        library.addBook(b7);
        library.addBook(b8);
        library.addBook(b9);

        library.allowReaderToBorrowBook(r1,b4);
        library.allowReaderToBorrowBook(r1,b5);
        library.allowReaderToBorrowBook(r2,b1);
        library.allowReaderToBorrowBook(r2,b2);
        library.allowReaderToBorrowBook(r3,b3);
        library.allowReaderToBorrowBook(r3,b9);

        library.displayAvailableBooks();

        library.displayBooksBorrowedByReader(r1);

        library.displayReadersWhoBorrowedBook(b4);

        library.allowReaderToReturnBook(r1,b4);

        System.out.println(" * * *");
        library.displayTransactions();
    }
}
