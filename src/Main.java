public class Main {
    public static void createSpace() {
        System.out.println("~~~~~~~~~~~~~~~");
    }

    public static void main(String[] args) {
        Author author = new Author("Николай ", "Гоголь");
        Author author1 = new Author("Александр  ", "Дюма");
        Author author2 = new Author("Эрих Мария ", "Ремарк");
        Book book = new Book("Мертвые души", author, 1842);
        Book book1 = new Book("Граф Монте-Кристо", author1, 1844);
        Book book2 = new Book("Три товарища", author2, 1936);
        createSpace();
        System.out.println("Название книги: " + book.getBookName());
        System.out.println("Автор:  " + author.getName() + author.getSurName());
        System.out.println("Год издания: " + book.getYearOfPublishing());
        System.out.println("Год издания (новый): " + book.getYearOfPublishing());
        createSpace();
        System.out.println("Название книги: " + book1.getBookName());
        System.out.println("Автор: " + author1.getName() + author1.getSurName());
        System.out.println("Год издания: " + book1.getYearOfPublishing());
        System.out.println("Год издания (новый): " + book1.getYearOfPublishing());
        createSpace();
        System.out.println("Название книги: " + book2.getBookName());
        System.out.println("Автор: " + author2.getName() + author2.getSurName());
        System.out.println("Год издания: " + book2.getYearOfPublishing());
        System.out.println("Год издания (новый): " + book2.getYearOfPublishing());
        createSpace();
        System.out.println("Это одинаковые книги?" + "\nС первой: " + book.equals(book) + "\nСо второй: " + book.equals(book1) + "\nСо третьей: " + book.equals(book2));
        createSpace();
        System.out.println("Хеш-коды книг:" + "\nПервой - " + book.hashCode() + "\nВторой - " + book1.hashCode() + "\nТретьей - " + book2.hashCode());
        createSpace();
        System.out.println(book);
        createSpace();
        System.out.println(book1);
        createSpace();
        System.out.println(book2);

    }


}