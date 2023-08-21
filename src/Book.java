import java.util.Objects;

public class Book {
    private final String bookName;
    private int publishingYear;
    private final Author author;


    public Book(String bookName,Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;


    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publishingYear, author);
    }

    public void setPublishingYear() {
        this.publishingYear =2022;

    }

    @Override
    public String toString() {
        return  "название книги =  '" + bookName + '\'' +
                ", год выпуска книги =  " + publishingYear +
                ", автор бестселлера =  " + author;
    }
}
