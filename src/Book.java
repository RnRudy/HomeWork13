import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int yearOfPublishing;

    public Book(String bookName, Author author, int yearOfPublishing) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public boolean equals(Object o) {
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(bookName, author, yearOfPublishing);
    }

    public String toString() {
        return "Название: " + "\"" + this.bookName + "\"" + "\nАвтор: " + author + "\nГод публикации: " + this.yearOfPublishing + " г.";
    }
}





