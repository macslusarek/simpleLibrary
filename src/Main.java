public class Main {

    public static void main(String[] args) {

        Library myLibrary = new Library();

        myLibrary.addBook("Thinking in java", "John Doe", false, 1112, 2006);
        myLibrary.addBook("Rusz glowa Java", "John Doe", false, 789, 2011);

        myLibrary.getSizeOfLibrary();
        myLibrary.listOfTheBooks();

    }
}
