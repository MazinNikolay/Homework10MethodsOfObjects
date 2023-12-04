import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int publishingYear;

    public Book(String nameBook, Author author, int publishingYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author.getFirstName() + " " + author.getLastName();
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o.getClass() == getClass()) {
            Book book = (Book) o;
            return book.getPublishingYear() == getPublishingYear() && book.getNameBook().equals(getNameBook()) && book.author.equals(author);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishingYear, nameBook, author.toString());
    }

    @Override
    public String toString() {
        return "Название книги: " + nameBook + " Автор: " + author.toString() + " год выпуска: " + publishingYear;
    }
}
