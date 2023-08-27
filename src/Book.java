import java.util.Objects;

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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book that = (Book) o;
        if (yearOfPublishing != that.yearOfPublishing) return false;
        if (author != author) return false;
        return bookName.equals(that.bookName);
    }
    public int hashCode() {
        return Objects.hash(bookName, author, yearOfPublishing);
    }
    public String toString() {
        return "Название: " + "\"" + this.bookName + "\"" + "\nАвтор: " + author + "\nГод публикации: " + this.yearOfPublishing + " г.";
    }
}





