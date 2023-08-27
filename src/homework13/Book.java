package homework13;

public class Book {
    private String bookName;
    private String author;
    private int yearOfPublishing;

    public Book(String bookName, String author, int yearOfPublishing) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}
