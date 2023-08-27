import java.util.Objects;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author that = (Author) o;
        if (name != that.name) return false;
        return name.equals(that.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return "Имя: " + name;
    }
}
