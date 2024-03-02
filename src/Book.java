public class Book {
    String bookname;
    Author author;
    int publicationYear;

    //<editor-fold desc="Getters-Setters">
    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    //</editor-fold>

    public Book(String bookname, Author author, int publicationYear) {
        this.bookname = bookname;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
