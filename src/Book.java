public class Book {

    private String title;
    private String author;
    private Boolean borrowed;
    private Integer numberOfPages;
    private Integer publicationYear;

    public Book() {
    }

    public Book(String title, String author, Boolean borrowed, Integer numberOfPages, Integer publicationYear) {
        this.title = title;
        this.author = author;
        this.borrowed = borrowed;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        this.borrowed = borrowed;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void printBook() {
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Title: " + this.getTitle());
        System.out.println("No. of pages: " + this.getNumberOfPages());
        System.out.println("Publication year: " + this.getPublicationYear());
    }
}
