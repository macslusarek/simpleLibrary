import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void addBook(String bookTitle, String bookAuthor, Boolean isBorrowed, Integer bookNumberOfPages, Integer bookPublicationYear) {
        books.add(new Book(bookTitle, bookAuthor, isBorrowed,bookNumberOfPages, bookPublicationYear));
    }

    public void listOfTheBooks() {
        for (Book book : books) {
            book.printBook();
        }
    }

    public void getSizeOfLibrary() {
        System.out.println("Number of books in the library: " + books.size());
    }


}
