package Model;

public class Book {
   public int id;
   public String title;
   public String author;
   public String cagegory;
   public String publisher;
   public int year;

    public Book() {
    }

    public Book(int id, String title, String author, String cagegory, String publisher, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.cagegory = cagegory;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", cagegory='" + cagegory + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}';
    }
}
